package com.dalo.patterns.creational_patterns.abstract_factory.app;

import com.dalo.patterns.creational_patterns.abstract_factory.dao.EmployeeDao;
import com.dalo.patterns.creational_patterns.abstract_factory.factory.DaoFactory;

public class Application {
    public static void main(String[] args) {
        DaoFactory postgresFactory = DaoFactory.getDaoFactory(DaoFactory.POSTGRES);

        EmployeeDao employeeDao = postgresFactory.createEmployeeDao();
        employeeDao.getEmployeeById(1L);
    }

}
