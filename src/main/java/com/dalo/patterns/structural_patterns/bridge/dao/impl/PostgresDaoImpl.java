package com.dalo.patterns.structural_patterns.bridge.dao.impl;

import com.dalo.patterns.structural_patterns.bridge.dao.StorageDao;

public class PostgresDaoImpl<T> implements StorageDao<T> {
    @Override
    public T save(T employee) {
        return null;
    }
}
