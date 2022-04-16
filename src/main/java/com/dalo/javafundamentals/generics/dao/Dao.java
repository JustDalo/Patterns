package com.dalo.javafundamentals.generics.dao;

import java.util.List;
import java.util.Optional;

public interface Dao<T> {
    T create(T entity);
    void delete(T entity);
    Optional<T> findById(Long id);
    List<T> findAll();
}
