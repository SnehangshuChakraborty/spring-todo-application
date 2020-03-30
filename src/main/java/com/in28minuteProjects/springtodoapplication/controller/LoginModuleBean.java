package com.in28minuteProjects.springtodoapplication.controller;

public class LoginModuleBean {

    String message = "";

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "LoginModuleBean{" +
                "message='" + message + '\'' +
                '}';
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LoginModuleBean(String message){
        this.message = message;
    }
}
