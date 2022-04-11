package com.dalo.patterns.behavioralPatterns.visitor.dao.impl;

import com.dalo.patterns.behavioralPatterns.visitor.dao.UserDao;
import com.dalo.patterns.behavioralPatterns.visitor.model.User;
import com.dalo.patterns.behavioralPatterns.visitor.visitor.Visitor;

public class UserDaoImpl extends DaoImpl<User> implements UserDao {
    @Override
    public User getUserByEmail(String email) {
        return null;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitUserDao(this);
    }
}
