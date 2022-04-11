package com.dalo.patterns.behavioral_patterns.template_method.template;

public class SecondNetwork extends Network {

    @Override
    boolean logIn(String userName, String password) {
        System.out.println("second");
        return true;
    }
}
