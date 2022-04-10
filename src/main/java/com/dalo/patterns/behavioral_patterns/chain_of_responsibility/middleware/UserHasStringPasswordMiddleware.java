package com.dalo.patterns.behavioral_patterns.chain_of_responsibility.middleware;

public class UserHasStringPasswordMiddleware extends Middleware {
    @Override
    public boolean check(String email, String password) {
        if (password.contains("@")) {
            return checkNext(email, password);
        }
        return false;
    }
}
