package com.dalo.patterns.creational_patterns.factory_method.factory;

import com.dalo.patterns.creational_patterns.factory_method.dao.EmployeeDao;
import com.dalo.patterns.creational_patterns.factory_method.dao.HashTableEmployeeDao;

public class HashTableFactory extends DaoFactory {

    @Override
    public EmployeeDao createEmployeeDao() {
        return new HashTableEmployeeDao();
    }
}
