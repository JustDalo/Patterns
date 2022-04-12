package com.dalo.patterns.behavioralPatterns.chainOfResponsibility.middleware;

public class UserHasStrongPasswordMiddleware extends Middleware {
    @Override
    public boolean check(String email, String password) {
        if (password.contains("@")) {
            return checkNext(email, password);
        }
        return false;
    }
}
