/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gennis.servervnc;

import java.awt.Color;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;

/**
 *
 * @author leand
 */
public class Tela extends javax.swing.JFrame {

    /**
     * Creates new form Tela
     */
    public Tela() {
        initComponents();
    }
 
    public void setStatus(boolean isConectado) {
       
        if(isConectado)
        {
          status.setBackground(new java.awt.Color(51,255,0)); 
           // System.out.println("Online");
           // TelaInstanceCliente.getClienteServidor().enviarMensagemServidor("Online");
        }
        else
        {
            status.setBackground(new java.awt.Color(255, 0, 51));
           // TelaInstanceCliente.getClienteServidor().enviarMensagemServidor("Offline");
        }
         status.updateUI();
    }
    
    
     public void setStatusConect(boolean isConectado) {
       
        if(isConectado)
        {
           isKeepLB.setText("Online");
            System.out.println("Online");
           // TelaInstanceCliente.getClienteServidor().enviarMensagemServidor("Online");
        }
        else
        {
            isKeepLB.setText("Offline");
             System.out.println("Offline");
           // TelaInstanceCliente.getClienteServidor().enviarMensagemServidor("Offline");
        }
         isKeepLB.updateUI();
    }
    
        public void setMensage(String texto) {
       
       
          mensageLB.setText(texto);
        
           // TelaInstanceCliente.getClienteServidor().enviarMensagemServidor("Online");
        
         mensageLB.updateUI();
    }
    
        
        public void setMensageConect(String texto) {
       
       
          keyConectLB.setText(texto);
        
           // TelaInstanceCliente.getClienteServidor().enviarMensagemServidor("Online");
        
         keyConectLB.updateUI();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        status = new javax.swing.JPanel();
        send = new javax.swing.JLabel();
        keeepBT = new javax.swing.JLabel();
        conect = new javax.swing.JLabel();
        disconect = new javax.swing.JLabel();
        mensageLB = new javax.swing.JLabel();
        keyConectLB = new javax.swing.JLabel();
        keyIDTX = new javax.swing.JTextField();
        mensageTX = new javax.swing.JTextField();
        isKeepLB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        status.setBackground(new java.awt.Color(255, 255, 255));

        send.setBackground(new java.awt.Color(8, 22, 17));
        send.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        send.setForeground(new java.awt.Color(255, 255, 255));
        send.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        send.setText("START STREAM");
        send.setOpaque(true);
        send.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sendMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sendMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sendMouseExited(evt);
            }
        });

        keeepBT.setBackground(new java.awt.Color(8, 22, 17));
        keeepBT.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        keeepBT.setForeground(new java.awt.Color(255, 255, 255));
        keeepBT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        keeepBT.setText("STOP STREAM");
        keeepBT.setOpaque(true);
        keeepBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                keeepBTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                keeepBTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                keeepBTMouseExited(evt);
            }
        });

        conect.setBackground(new java.awt.Color(8, 22, 17));
        conect.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        conect.setForeground(new java.awt.Color(255, 255, 255));
        conect.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        conect.setText("CONECT");
        conect.setOpaque(true);
        conect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                conectMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                conectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                conectMouseExited(evt);
            }
        });

        disconect.setBackground(new java.awt.Color(8, 22, 17));
        disconect.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        disconect.setForeground(new java.awt.Color(255, 255, 255));
        disconect.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        disconect.setText("DISCONECT");
        disconect.setOpaque(true);
        disconect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disconectMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                disconectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                disconectMouseExited(evt);
            }
        });

        mensageLB.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mensageLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mensageLB.setText("X");

        keyConectLB.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        keyConectLB.setForeground(new java.awt.Color(51, 51, 51));
        keyConectLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        keyConectLB.setText("0");
        keyConectLB.setAlignmentX(9.0F);
        keyConectLB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        keyIDTX.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        mensageTX.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        isKeepLB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        isKeepLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout statusLayout = new javax.swing.GroupLayout(status);
        status.setLayout(statusLayout);
        statusLayout.setHorizontalGroup(
            statusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mensageLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(keyConectLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(statusLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(statusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mensageTX, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(keyIDTX)
                    .addComponent(send, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(conect, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(statusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(keeepBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(disconect, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                    .addComponent(isKeepLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(62, 62, 62))
        );
        statusLayout.setVerticalGroup(
            statusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(statusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(conect, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(disconect, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(statusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(keyIDTX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isKeepLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(keyConectLB, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mensageLB, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mensageTX, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(statusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(send, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(keeepBT, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );

        jPanel1.add(status, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendMouseClicked
       
        TCP request = new TCP();
        request.setStartStream(true);
        request.setMensage(mensageTX.getText());
        
        
        TelaInstanceCliente.getClienteServidor().enviarMensagemServidor(request);
    }//GEN-LAST:event_sendMouseClicked

    private void keeepBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keeepBTMouseClicked
       
        TCP request = new TCP();
        request.setStoptStream(true);
        
        
        TelaInstanceCliente.getClienteServidor().enviarMensagemServidor(request);
        
    }//GEN-LAST:event_keeepBTMouseClicked

    private void conectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conectMouseClicked
        TCP request = new TCP();
        request.setConect(true);
        request.setKeyID(keyIDTX.getText());
        
        TelaInstanceCliente.getClienteServidor().enviarMensagemServidor(request);
    }//GEN-LAST:event_conectMouseClicked

    private void disconectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disconectMouseClicked
        TCP tcp = new TCP();
        tcp.setPressteclado(true);
        tcp.setControl(true);
        tcp.setTecla(KeyEvent.VK_D);
        
        if(tcp.isPressteclado())
                 {
                   tcp.setControl(true);  
                  System.out.println("comando.isPressteclado() " + tcp.isPressteclado());
                  System.out.println("Tecla" + tcp.getTecla());
                  tcp.setSend(true);
                  tcp.setMensage("Tecla" + tcp.getTecla()); 
                  tcp.setControl(false);
                 }
       
        
        TelaInstanceCliente.getClienteServidor().enviarMensagemServidor(tcp);
    }//GEN-LAST:event_disconectMouseClicked

    private void conectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conectMouseEntered
        conect.setBackground(Color.BLUE);
        
    }//GEN-LAST:event_conectMouseEntered

    private void conectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conectMouseExited
        conect.setBackground(new java.awt.Color(8, 22, 17));
    }//GEN-LAST:event_conectMouseExited

    private void disconectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disconectMouseEntered
        disconect.setBackground(Color.BLUE);
    }//GEN-LAST:event_disconectMouseEntered

    private void disconectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disconectMouseExited
        disconect.setBackground(new java.awt.Color(8, 22, 17));
    }//GEN-LAST:event_disconectMouseExited

    private void sendMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendMouseEntered
        send.setBackground(Color.BLUE);
    }//GEN-LAST:event_sendMouseEntered

    private void sendMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendMouseExited
        send.setBackground(new java.awt.Color(8, 22, 17));
    }//GEN-LAST:event_sendMouseExited

    private void keeepBTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keeepBTMouseEntered
        keeepBT.setBackground(Color.BLUE);
    }//GEN-LAST:event_keeepBTMouseEntered

    private void keeepBTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keeepBTMouseExited
        keeepBT.setBackground(new java.awt.Color(8, 22, 17));
    }//GEN-LAST:event_keeepBTMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel conect;
    private javax.swing.JLabel disconect;
    private javax.swing.JLabel isKeepLB;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel keeepBT;
    private javax.swing.JLabel keyConectLB;
    private javax.swing.JTextField keyIDTX;
    private javax.swing.JLabel mensageLB;
    private javax.swing.JTextField mensageTX;
    private javax.swing.JLabel send;
    private javax.swing.JPanel status;
    // End of variables declaration//GEN-END:variables
}
