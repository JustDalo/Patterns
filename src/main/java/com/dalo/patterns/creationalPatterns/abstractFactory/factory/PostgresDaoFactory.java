package com.dalo.patterns.creationalPatterns.abstractFactory.factory;

import com.dalo.patterns.creationalPatterns.abstractFactory.dao.ClientDao;
import com.dalo.patterns.creationalPatterns.abstractFactory.dao.EmployeeDao;
import com.dalo.patterns.creationalPatterns.abstractFactory.dao.postgresImpl.PostgresClientDao;
import com.dalo.patterns.creationalPatterns.abstractFactory.dao.postgresImpl.PostgresEmployeeDao;

public class PostgresDaoFactory extends DaoFactory {

    @Override
    public EmployeeDao createEmployeeDao() {
        return new PostgresEmployeeDao();
    }

    @Override
    public ClientDao createClientDao() {
        return new PostgresClientDao();
    }
}
