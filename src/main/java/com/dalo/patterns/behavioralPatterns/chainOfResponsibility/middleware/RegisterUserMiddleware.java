package com.dalo.patterns.behavioralPatterns.chainOfResponsibility.middleware;

import com.dalo.patterns.behavioralPatterns.chainOfResponsibility.dao.UserDao;
import com.dalo.patterns.behavioralPatterns.chainOfResponsibility.model.User;

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
