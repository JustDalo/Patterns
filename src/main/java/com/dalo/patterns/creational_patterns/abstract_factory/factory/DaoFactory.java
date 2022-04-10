package com.dalo.patterns.creational_patterns.abstract_factory.factory;

import com.dalo.patterns.creational_patterns.abstract_factory.dao.ClientDao;
import com.dalo.patterns.creational_patterns.abstract_factory.dao.EmployeeDao;

public abstract class DaoFactory {
    public abstract EmployeeDao createEmployeeDao();
    public abstract ClientDao createClientDao();
}
