package com.dalo.patterns.behavioralPatterns.templateMethod.template;

public class FirstNetwork extends Network {
    @Override
    boolean logIn(String userName, String password) {
        System.out.println("first");
        return true;
    }
}
