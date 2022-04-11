package com.dalo.patterns.creationalPatterns.abstractFactory.factory.impl;

import com.dalo.patterns.creationalPatterns.abstractFactory.dao.ClientDao;
import com.dalo.patterns.creationalPatterns.abstractFactory.dao.EmployeeDao;
import com.dalo.patterns.creationalPatterns.abstractFactory.dao.postgresImpl.PostgresClientDao;
import com.dalo.patterns.creationalPatterns.abstractFactory.dao.postgresImpl.PostgresEmployeeDao;
import com.dalo.patterns.creationalPatterns.abstractFactory.factory.DaoFactory;

public class PostgresDaoFactory implements DaoFactory {

    @Override
    public EmployeeDao createEmployeeDao() {
        return new PostgresEmployeeDao();
    }

    @Override
    public ClientDao createClientDao() {
        return new PostgresClientDao();
    }
}
