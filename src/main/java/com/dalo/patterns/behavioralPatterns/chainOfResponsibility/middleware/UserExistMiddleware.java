package com.dalo.patterns.behavioralPatterns.chainOfResponsibility.middleware;

import com.dalo.patterns.behavioralPatterns.chainOfResponsibility.dao.UserDao;

public class UserExistMiddleware extends Middleware {
    private UserDao userDao;
    @Override
    public boolean check(String email, String password) {
        if (userDao.getUserByEmail(email) == null)
            return false;
        return checkNext(email, password);
    }
}
