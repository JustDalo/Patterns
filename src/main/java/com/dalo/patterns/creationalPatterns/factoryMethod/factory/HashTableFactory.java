package com.dalo.patterns.creationalPatterns.factoryMethod.factory;

import com.dalo.patterns.creationalPatterns.factoryMethod.dao.EmployeeDao;
import com.dalo.patterns.creationalPatterns.factoryMethod.dao.HashTableEmployeeDao;

public class HashTableFactory extends DaoFactory {

    @Override
    public EmployeeDao createEmployeeDao() {
        return new HashTableEmployeeDao();
    }
}
