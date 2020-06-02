/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gennis.servervnc;
 
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.SocketException;
import java.net.URL;
import java.security.CodeSource;
import java.security.ProtectionDomain; 
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leandro Oliveira
 */
public class RecebedorUTF implements Runnable {

    private Robot robot;
    private boolean especial;
    private boolean init = true;
    private ObjectInputStream is;
    private ClienteServidor servidor;
    private TCP tcp = new TCP();
    private Stream stream = new Stream();
    

    //Recebe uma instancia ativa od socket servidor
    public RecebedorUTF(ClienteServidor clienteServidor) {
        try {
            // this.servidor = servidor;
            this.servidor = clienteServidor;
            robot = new Robot();
        } catch (AWTException ex) {
            Logger.getLogger(RecebedorUTF.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void run() {

        while (true) {
            if (servidor.isConectado()) {
                try {

                    //Marca com pronto para receber dos de entrada de mouse e teclado
                    init = TelaInstanceCliente.getLoad().isInit();
                    is = new ObjectInputStream(servidor.getSocket().getInputStream());

                    tcp = (TCP) is.readObject();
                    
                    if (init && tcp.isControl()) {
                        if (tcp.isMoveMouse()) {
                              robot.mouseMove(tcp.getMouseX(), tcp.getMouseY());
                            //Move mouse
                            //Mouse.mouseMove(tcp.getMouseX(), tcp.getMouseY());
                            
                        } else if (tcp.isMouseClick()) {

                            switch (tcp.getMouseBotao()) {
                                case 1:
                                    robot.mousePress(InputEvent.BUTTON1_MASK);
                                    robot.mouseRelease(InputEvent.BUTTON1_MASK);
                                    break;
                                case 3:
                                    robot.mousePress(InputEvent.BUTTON3_MASK);
                                    robot.mouseRelease(InputEvent.BUTTON3_MASK);
                                    break;
                                case 9:
                                    robot.mousePress(InputEvent.BUTTON1_MASK);
                                    robot.mouseRelease(InputEvent.BUTTON1_MASK);
                                    robot.mousePress(InputEvent.BUTTON1_MASK);
                                    robot.mouseRelease(InputEvent.BUTTON1_MASK);
                                    break;
                                default:
                                    break;
                            }
                        } else if (tcp.isPressteclado()) {

                            int tecla = tcp.getTecla();

                            while (true) {

                                switch (tecla) {
                                    case 91:
                                        tecla = 524;
                                        break;
                                    case 226:
                                        tecla = 92;
                                        break;
                                    case 192:
                                        tecla = 34;
                                        break;
                                    case 196:
                                        tecla = 47;
                                        break;
                                    case 191:
                                        tecla = 59;
                                        break;
                                    case 187:
                                        tecla = 43;
                                        break;
                                    case 189:
                                        tecla = 45;
                                        break;
                                    default:
                                        break;
                                }

                                if (tecla > 15 && tecla < 20) {

                                    especial = true;
                                    robot.keyPress(tecla);
                                    break;

                                }
                                robot.keyPress(tecla);
                                robot.keyRelease(tecla);

                                if (especial) {

                                    robot.keyRelease(KeyEvent.VK_ALT);
                                    robot.keyRelease(KeyEvent.VK_SHIFT);
                                    robot.keyRelease(KeyEvent.VK_CONTROL);
                                    // robot.keyRelease(KeyEvent.VK_C);

                                    especial = false;
                                }

                                break;
                            }

                        }
                        continue;
                    }
                    //Mensagem de atividade da conexão recebida do sevidor
                    if (tcp.isKeepLive()) {     
                        continue;
                    }

                    if (tcp.isStartStream()) {                       
                        stream.start(servidor.getMacID());
                       // stream.start(servidor.getMAC().getKeyID());
                        continue;
                    }
                    
                    if (tcp.isDisconect() || tcp.isStoptStream()) {                       
                        stream.stop();                                                 
                        continue;
                    }

                    if (tcp.isAceiteConect()) {
                        //Mesagem recebida do cliente remto que a conexão foi aceita  
                        TelaInstanceCliente.getApp().setMensage("Conexao aceita de " + tcp.getMensage());

                        continue;
                    }

                    //Solicitação de conexão do pc remoto
                    if (tcp.isConect()) {

                       TelaInstanceCliente.getApp().setMensage(tcp.getMensage());                         

                       TelaInstanceCliente.getTela().setStatusConect(true);
                       TelaInstanceCliente.getLoad().start();                       
                   
                       //Retorna um objeto de conexão aceita
                        TCP reTcp = new TCP();
                        reTcp.setAceiteConect(true);
                        reTcp.setMensage(servidor.getMAC().getKeyID());
                        servidor.enviarMensagemServidor(reTcp);

                        continue;
                    }
                    //Imprime na tela uma mensagem 
                    if (tcp.isSend()) {
                       TelaInstanceCliente.getApp().setMensage(tcp.getMensage());
                        continue;
                    }

                } catch (SocketException ex) {
                   

                } catch (IOException ex) {
                    
                } catch (Exception ex) {
                    
                }

            }
            else{               
                return;
            }
        }
    }
   
}
