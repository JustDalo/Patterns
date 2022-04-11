package com.dalo.patterns.behavioralPatterns.visitor.dao;

import com.dalo.patterns.behavioralPatterns.visitor.model.User;

public interface UserDao extends Dao<User> {
    User getUserByEmail(String email);
}
