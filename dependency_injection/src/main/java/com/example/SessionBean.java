package com.example;

public class SessionBean {
    private String user;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void handleSession() {
        System.out.println("Session bean handling session for user: " + user);
    }
}
