/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gennis.servervnc;

/**
 *
 * @author Leandro Oliveira
 */
public class TelaInstanceCliente {
    
    private static ClienteServidor clienteServidor = new ClienteServidor("192.168.0.254", 9988);
    private static APP app  = new APP();    
    private static Tela tela = new Tela();
    private static Load load = new Load();
    private static Monitor monitor = new Monitor();
     
    
    public static ClienteServidor getClienteServidor() {
        
        return clienteServidor;
    }
    
    public static Tela getTela() {
        return tela;
    }

    public static Load getLoad() {
        return load;
    }

    public static APP getApp() {
        return app;
    }

    public static Monitor getMonitor() {
        return monitor;
    }

    public static void setMonitor(Monitor monitor) {
        TelaInstanceCliente.monitor = monitor;
    }
    
    
    
    
    
}
