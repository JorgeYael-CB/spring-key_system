package com.org.yael.roblox.keysystem.key_system.application.services;





public class ResponseService<TDTO> {

    private int status;
    private String message;
    private TDTO data;
    private String token;


    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public TDTO getData() {
        return data;
    }
    public void seData(TDTO data) {
        this.data = data;
    }
    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }

}
