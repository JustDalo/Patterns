package com.dalo.patterns.behavioral_patterns.template_method.template;

public class FirstNetwork extends Network {
    @Override
    boolean logIn(String userName, String password) {
        System.out.println("first");
        return true;
    }
}
