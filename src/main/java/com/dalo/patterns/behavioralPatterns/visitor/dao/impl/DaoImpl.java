package com.dalo.patterns.behavioralPatterns.visitor.dao.impl;

import com.dalo.patterns.behavioralPatterns.visitor.dao.Dao;
import com.dalo.patterns.behavioralPatterns.visitor.visitor.Visitor;

public class DaoImpl<T> implements Dao<T> {
    @Override
    public T save(T entity) {
        return null;
    }

    @Override
    public void delete(T entity) {

    }

    @Override
    public String accept(Visitor visitor) {
        return null;
    }
}
