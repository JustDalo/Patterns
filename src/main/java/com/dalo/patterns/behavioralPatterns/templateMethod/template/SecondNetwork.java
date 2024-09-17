package com.dalo.patterns.behavioralPatterns.templateMethod.template;

public class SecondNetwork extends Network {

    @Override
    boolean logIn(String userName, String password) {
        System.out.println("second");
        return true;
    }
}
