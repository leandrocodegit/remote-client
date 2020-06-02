/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gennis.servervnc;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leandro Oliveira
 */

public class ClienteServidor implements Runnable {

    private String host;
    private int porta;
    private boolean conectado = false;
    //Usado como o ID da conexão no servidor
    private String macID;
    private Socket socket;

    RecebedorUTF r;
    Thread t;

    private PrintStream saida;

    public ClienteServidor(String host, int porta) {
        this.host = host;
        this.porta = porta;
    }

    public boolean isConectado() {
        return conectado;
    }

    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }

    public PrintStream getSaida() {
        return saida;
    }

    public Socket getSocket() {
        return socket;
    }

    public String getMacID() {
        return macID;
    }

    public void setMacID(String macID) {
        this.macID = macID;
    }

    //Estabelece uma conexão socket com servidor
    synchronized public void conectar() {

        try {
            conectado = false;
            TelaInstanceCliente.getApp().setStatus(false, "Conectando ao servidor...");
            TelaInstanceCliente.getApp().setMensage("Sessão finalizada.");

            while (conectado == false) {

                socket = new Socket();
                try {

                    Thread.sleep(2000);
                    InetSocketAddress ip = new InetSocketAddress(host, porta);

                    //Aguarda 5s até que a conexão seja estabelecida
                    //Cado ultrapasse 5s tenta conectar novamente
                    socket.connect(ip, 5000);

                    break;
                } catch (Exception ex) {
                    conectado = false;
                }

            }
            // thread para receber mensagens do servidor
            // lê msgs do teclado e manda pro servidor
            r = new RecebedorUTF(this);
            t = new Thread(r);
            t.start();

            //Marca como conectado o soket
            conectado = true;

            //Imprime na tela conectado
            TelaInstanceCliente.getApp().setStatus(true, "Conectado");

            //Envia o mac ao servidor sempre que uma nova conexão é estabelecida
            enviarMensagemServidor(getMAC());

            //Imprime na tela o endereço mac
            TelaInstanceCliente.getApp().setMAC(getMAC().getKeyID());

        } catch (Exception ex) {
            conectado = false;
            //System.out.println("Erro ao conectar");
        }

    }

    //Recuera o endereço MAC do compuador para enviar ao servidor
    public TCP getMAC() {

        TCP request = new TCP();
        request.setKey(conectado);
        try {
            request.setKeyID(macID);            

        } catch (Exception ex) {
            Logger.getLogger(ClienteServidor.class.getName()).log(Level.SEVERE, null, ex);
        }

        return request;
    }

    //Envia mensagem ao servidor
    public void enviarMensagemServidor(TCP request) {

        ObjectOutputStream os = null;      
        try {
            
            if (socket != null) {
                os = new ObjectOutputStream(this.socket.getOutputStream());
                os.writeObject(request);
            } 

        } catch (IOException ex) {
            conectado = false;
        }

    }

    public void testConect(TCP request) {

        ObjectOutputStream os = null;
        try {

            if (socket != null) {
                os = new ObjectOutputStream(this.socket.getOutputStream());
                os.writeObject(request);
            } 

        } catch (IOException ex) {
            conectado = false;
        }

    }

    @Override
    public void run() {
        conectar();
    }

    public void sendMSG(String msg) {

        saida.println(msg);

    }

}
