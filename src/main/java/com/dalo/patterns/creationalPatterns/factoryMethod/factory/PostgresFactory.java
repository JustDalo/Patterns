package com.dalo.patterns.creationalPatterns.factoryMethod.factory;

import com.dalo.patterns.creationalPatterns.factoryMethod.dao.EmployeeDao;
import com.dalo.patterns.creationalPatterns.factoryMethod.dao.PostgresEmployeeDao;

public class PostgresFactory extends DaoFactory {
    @Override
    public EmployeeDao createEmployeeDao() {
        return new PostgresEmployeeDao();
    }
}
