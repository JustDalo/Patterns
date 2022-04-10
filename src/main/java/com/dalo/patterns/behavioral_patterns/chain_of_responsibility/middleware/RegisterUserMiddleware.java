package com.dalo.patterns.behavioral_patterns.chain_of_responsibility.middleware;

import com.dalo.patterns.behavioral_patterns.chain_of_responsibility.dao.UserDao;
import com.dalo.patterns.behavioral_patterns.chain_of_responsibility.model.User;

public class RegisterUserMiddleware extends Middleware {
    private UserDao userDao;
    @Override
    public boolean check(String email, String password) {
        if (userDao.createUser(new User(email, password)) == null) {
            return false;
        }
        return checkNext(email, password);
    }
}
