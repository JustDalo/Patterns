package com.dalo.patterns.creationalPatterns.abstractFactory.factory.impl;

import com.dalo.patterns.creationalPatterns.abstractFactory.dao.ClientDao;
import com.dalo.patterns.creationalPatterns.abstractFactory.dao.EmployeeDao;
import com.dalo.patterns.creationalPatterns.abstractFactory.dao.hashtableImpl.HashTableClientDao;
import com.dalo.patterns.creationalPatterns.abstractFactory.dao.hashtableImpl.HashTableEmployeeDao;
import com.dalo.patterns.creationalPatterns.abstractFactory.factory.DaoFactory;

public class HashTableDaoFactory implements DaoFactory {
    @Override
    public EmployeeDao createEmployeeDao() {
        return new HashTableEmployeeDao();
    }

    @Override
    public ClientDao createClientDao() {
        return new HashTableClientDao();
    }
}
