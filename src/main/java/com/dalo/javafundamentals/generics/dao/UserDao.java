package com.dalo.javafundamentals.generics.dao;

import com.dalo.javafundamentals.generics.model.User;

import java.util.Optional;

public interface UserDao extends Dao<User> {
    Optional<User> findUserByName(String name);
}
