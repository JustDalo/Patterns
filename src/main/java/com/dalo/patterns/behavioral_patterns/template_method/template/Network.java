package com.dalo.patterns.behavioral_patterns.template_method.template;

public abstract class Network {
    protected String userName;
    protected String password;

    public boolean post(String message) {
        if (logIn(userName, password)) {
            return true;
        }
        return false;
    }
    abstract boolean logIn(String userName, String password);
}
