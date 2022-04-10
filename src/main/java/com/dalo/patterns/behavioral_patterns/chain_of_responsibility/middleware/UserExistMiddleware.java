package com.dalo.patterns.behavioral_patterns.chain_of_responsibility.middleware;

import com.dalo.patterns.behavioral_patterns.chain_of_responsibility.dao.UserDao;

public class UserExistMiddleware extends Middleware {
    private UserDao userDao;
    @Override
    public boolean check(String email, String password) {
        if (userDao.getUserByEmail(email) == null)
            return false;
        return checkNext(email, password);
    }
}
