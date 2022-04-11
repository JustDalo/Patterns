package com.dalo.patterns.behavioralPatterns.visitor.dao;

import com.dalo.patterns.behavioralPatterns.visitor.model.Employee;
import com.dalo.patterns.behavioralPatterns.visitor.visitor.Visitor;

public interface Dao<T> {
    T save(T entity);
    void delete(T entity);
    String accept(Visitor visitor);
}
