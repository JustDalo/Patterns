package com.dalo.patterns.creationalPatterns.abstractFactory.app;

import com.dalo.patterns.creationalPatterns.abstractFactory.dao.EmployeeDao;
import com.dalo.patterns.creationalPatterns.abstractFactory.factory.DaoFactory;

public class Application {
    public static void main(String[] args) {
        DaoFactory postgresFactory = DaoFactory.getDaoFactory(DaoFactory.POSTGRES);

        EmployeeDao employeeDao = postgresFactory.createEmployeeDao();
        employeeDao.getEmployeeById(1L);
    }

}
