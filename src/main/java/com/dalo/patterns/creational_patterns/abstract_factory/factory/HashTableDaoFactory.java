package com.dalo.patterns.creational_patterns.abstract_factory.factory;

import com.dalo.patterns.creational_patterns.abstract_factory.dao.ClientDao;
import com.dalo.patterns.creational_patterns.abstract_factory.dao.EmployeeDao;
import com.dalo.patterns.creational_patterns.abstract_factory.dao.hashtable_impl.HashTableClientDao;
import com.dalo.patterns.creational_patterns.abstract_factory.dao.hashtable_impl.HashTableEmployeeDao;

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
