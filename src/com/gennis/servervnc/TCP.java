/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gennis.servervnc;

import java.io.Serializable;

/**
 *
 * @author Leandro Oliveira
 */
public class TCP implements Serializable {

    private static final long serialVersionUID = 12345855655321L;

    private String keyID;
    private String mensage;
    private int tecla;
    private int mouseX;
    private int mouseY;
    private int mouseBotao;
    private boolean control;
    private boolean moveMouse;
    private boolean mouseClick;
    private boolean pressteclado;
    private boolean keepLive;
    private boolean keepLiveRequest;
    private boolean key;
    private boolean findKey;
    private boolean startStream;
    private boolean stoptStream;
    private boolean send;
    private boolean conect;
    private boolean disconect;
    private boolean aceiteConect;

    public String getKeyID() {
        return keyID;
    }

    public void setKeyID(String keyID) {
        this.keyID = keyID;
    }

    public String getMensage() {
        return mensage;
    }

    public void setMensage(String mensage) {
        this.mensage = mensage;
    }

    public int getTecla() {
        return tecla;
    }

    public void setTecla(int tecla) {
        this.tecla = tecla;
    }

    public int getMouseX() {
        return mouseX;
    }

    public void setMouseX(int mouseX) {
        this.mouseX = mouseX;
    }

    public int getMouseY() {
        return mouseY;
    }

    public void setMouseY(int mouseY) {
        this.mouseY = mouseY;
    }

    public int getMouseBotao() {
        return mouseBotao;
    }

    public void setMouseBotao(int mouseBotao) {
        this.mouseBotao = mouseBotao;
    }

    public boolean isControl() {
        return control;
    }

    public void setControl(boolean control) {
        this.control = control;
    }

    public boolean isMoveMouse() {
        return moveMouse;
    }

    public void setMoveMouse(boolean moveMouse) {
        this.moveMouse = moveMouse;
    }

    public boolean isMouseClick() {
        return mouseClick;
    }

    public void setMouseClick(boolean mouseClick) {
        this.mouseClick = mouseClick;
    }

    public boolean isPressteclado() {
        return pressteclado;
    }

    public void setPressteclado(boolean pressteclado) {
        this.pressteclado = pressteclado;
    }

    public boolean isKeepLive() {
        return keepLive;
    }

    public void setKeepLive(boolean keepLive) {
        this.keepLive = keepLive;
    }

    public boolean isKeepLiveRequest() {
        return keepLiveRequest;
    }

    public void setKeepLiveRequest(boolean keepLiveRequest) {
        this.keepLiveRequest = keepLiveRequest;
    }

    public boolean isKey() {
        return key;
    }

    public void setKey(boolean key) {
        this.key = key;
    }

    public boolean isFindKey() {
        return findKey;
    }

    public void setFindKey(boolean findKey) {
        this.findKey = findKey;
    }

    public boolean isStartStream() {
        return startStream;
    }

    public void setStartStream(boolean startStream) {
        this.startStream = startStream;
    }

    public boolean isStoptStream() {
        return stoptStream;
    }

    public void setStoptStream(boolean stoptStream) {
        this.stoptStream = stoptStream;
    }

    public boolean isSend() {
        return send;
    }

    public void setSend(boolean send) {
        this.send = send;
    }

    public boolean isConect() {
        return conect;
    }

    public void setConect(boolean conect) {
        this.conect = conect;
    }

    public boolean isDisconect() {
        return disconect;
    }

    public void setDisconect(boolean disconect) {
        this.disconect = disconect;
    }

    public boolean isAceiteConect() {
        return aceiteConect;
    }

    public void setAceiteConect(boolean aceiteConect) {
        this.aceiteConect = aceiteConect;
    }

    
}
