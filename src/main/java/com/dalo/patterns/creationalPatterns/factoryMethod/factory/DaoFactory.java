package com.dalo.patterns.creationalPatterns.factoryMethod.factory;

import com.dalo.patterns.creationalPatterns.factoryMethod.dao.EmployeeDao;

public abstract class DaoFactory {
    public abstract EmployeeDao createEmployeeDao();
}
