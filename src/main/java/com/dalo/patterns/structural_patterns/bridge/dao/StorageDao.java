package com.dalo.patterns.structural_patterns.bridge.dao;

public interface StorageDao<T> {
    T save(T entity);
}
