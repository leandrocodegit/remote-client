/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gennis.servervnc;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Leandro Oliveira
 * Inicia uma trasmissão da tela para o servidor rmtp
 * Este projeo visa controle pea interface web
 * O stream é transmitido para um servidor red5  e disponibilizado via WEBRTC
 */

public class Stream {
    
    String ID;

    public void start(String ID) {
        
        
        try {
            this.ID = ID;
            
            Toolkit tk = Toolkit.getDefaultToolkit();
            Dimension d = tk.getScreenSize();
             
            String cmd = "ffmpeg  -f gdigrab -framerate 30 -draw_mouse 1 -video_size " 
                    + d.width +"x" + d.height + " -show_region 1 -i desktop -vcodec libx264 -f flv rtmp://192.168.0.254:1935/LiveApp/" + ID;
  
             Runtime.getRuntime().exec("cmd /c  start /B start.jar\"");            
  
        } catch (Exception ex) {
           
           
        }
        finally{
            
        }
    }
    public void stop() {
        
        
        try {
            
           Runtime.getRuntime().exec("cmd /c  start /B stop.jar ");    
            
        } catch (Exception ex) {
            System.out.println("Erro ao para stream");           
        }
        
    }
    
    public static void main(String[] args) {
        
        Stream stream = new Stream();
        stream.start("125456456");
        // Scanner scanner = new Scanner(System.in);
         
          
        
      // stream.stop();        
    }
 
    
   
}


