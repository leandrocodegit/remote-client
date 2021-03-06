/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gennis.servervnc;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.URL;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author Leandro Oliveira
 */
public class APP extends javax.swing.JFrame {

    
     private ImageIcon on;
     private ImageIcon off;
    //private ImageIcon sombraBase1920 = new ImageIcon("/sombraBase1920.png");
    /**
     * Creates new form APP
     */
    public APP() {
       
            initComponents();
            TelaInstanceCliente.getClienteServidor().setMacID(getMAC());
       
            this.setBackground(new Color(0, 0, 0, 0));
         
                 
            File file = new File("");
             
            
            
            ImageIcon icon = new ImageIcon(file.getAbsolutePath() + "\\img\\icon.png");
            Image image = icon.getImage();
            
            setIconImage(image);
            
            on = new ImageIcon(file.getAbsolutePath() +  "/img/on.png");
            off = new ImageIcon(file.getAbsolutePath() + "/img/off.png");
        
    }
    
    public String getMAC()
    {
        String  mac = "";
        
        try {
             InetAddress ipLocal = InetAddress.getLocalHost();
            
             NetworkInterface network = NetworkInterface.getByInetAddress(ipLocal);   
            
             mac = DatatypeConverter.printHexBinary(network.getHardwareAddress());
              
        } catch (Exception ex) {
            Logger.getLogger(ClienteServidor.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        return mac;        
    }
    

    public void setStatus(boolean isConectado, String texto) {

        if (isConectado) {
           // status.setForeground(new java.awt.Color(0,204,255)); 
            status.setText(texto);
            fundo.setIcon(on);
            TelaInstanceCliente.getMonitor().setStatus(isConectado);
            
        } else {
           // status.setForeground(new java.awt.Color(255, 0, 51));
            status.setText(texto); 
            fundo.setIcon(off);
            TelaInstanceCliente.getMonitor().setStatus(isConectado);
        }
        status.updateUI();
        fundo.updateUI();
        
         
    }
 
    public void setMensage(String texto) {

        LBMensage.setText(texto);
        LBMensage.updateUI();
    }
    
    public void setMAC(String texto) {

        IDKey.setText(texto);
        IDKey.updateUI();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        IDKey = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LBMensage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fundo = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("   Robote");
        setIconImages(null);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(696, 35));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 2, 70, -1));

        IDKey.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        IDKey.setForeground(new java.awt.Color(255, 255, 255));
        IDKey.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        IDKey.setText("Não registrado");
        jPanel1.add(IDKey, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 270, 47));

        status.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        status.setForeground(new java.awt.Color(255, 255, 255));
        status.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        status.setText("Iniciando conexão...");
        jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 320, 42));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("_");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 29, 50));

        LBMensage.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LBMensage.setForeground(new java.awt.Color(255, 255, 255));
        LBMensage.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LBMensage.setText("x");
        jPanel1.add(LBMensage, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 500, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/person.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 40, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuvem.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 50, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/digital.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 40, 50));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Versão 1.0.0");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 110, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/robote.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 130, 160));

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/on.png"))); // NOI18N
        fundo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        fundo.setPreferredSize(new java.awt.Dimension(1200, 722));
        jPanel1.add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 640, 330));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(APP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(APP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(APP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(APP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new APP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDKey;
    private javax.swing.JLabel LBMensage;
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables
}
