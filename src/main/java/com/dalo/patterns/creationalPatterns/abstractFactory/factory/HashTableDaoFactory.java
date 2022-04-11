package com.dalo.patterns.creationalPatterns.abstractFactory.factory;

import com.dalo.patterns.creationalPatterns.abstractFactory.dao.ClientDao;
import com.dalo.patterns.creationalPatterns.abstractFactory.dao.EmployeeDao;
import com.dalo.patterns.creationalPatterns.abstractFactory.dao.hashtableImpl.HashTableClientDao;
import com.dalo.patterns.creationalPatterns.abstractFactory.dao.hashtableImpl.HashTableEmployeeDao;

public class HashTableDaoFactory extends DaoFactory {
    @Override
    public EmployeeDao createEmployeeDao() {
        return new HashTableEmployeeDao();
    }

    @Override
    public ClientDao createClientDao() {
        return new HashTableClientDao();
    }
}
