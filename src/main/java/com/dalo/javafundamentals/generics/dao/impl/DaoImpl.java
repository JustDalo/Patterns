package com.dalo.javafundamentals.generics.dao.impl;

import com.dalo.javafundamentals.generics.dao.Dao;

import java.util.List;
import java.util.Optional;

public class DaoImpl<T> implements Dao<T> {
    @Override
    public T create(T entity) {
        return null;
    }

    @Override
    public void delete(T entity) {

    }

    @Override
    public Optional<T> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<T> findAll() {
        return null;
    }
}
