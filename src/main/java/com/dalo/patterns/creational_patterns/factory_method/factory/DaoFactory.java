package com.dalo.patterns.creational_patterns.factory_method.factory;

import com.dalo.patterns.creational_patterns.factory_method.dao.EmployeeDao;

public abstract class DaoFactory {
    public abstract EmployeeDao createEmployeeDao();
}
