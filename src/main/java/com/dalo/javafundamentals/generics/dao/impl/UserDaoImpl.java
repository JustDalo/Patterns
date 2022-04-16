package com.dalo.javafundamentals.generics.dao.impl;

import com.dalo.javafundamentals.generics.dao.UserDao;
import com.dalo.javafundamentals.generics.model.User;

import java.util.Optional;

public class UserDaoImpl extends DaoImpl<User> implements UserDao {
    @Override
    public Optional<User> findUserByName(String name) {
        return Optional.empty();
    }
}
