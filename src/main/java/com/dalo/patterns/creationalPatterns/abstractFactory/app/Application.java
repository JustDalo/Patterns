package com.dalo.patterns.creationalPatterns.abstractFactory.app;

import com.dalo.patterns.creationalPatterns.abstractFactory.dao.EmployeeDao;
import com.dalo.patterns.creationalPatterns.abstractFactory.factory.DaoFactory;
import com.dalo.patterns.creationalPatterns.abstractFactory.factory.impl.PostgresDaoFactory;

public class Application {
    public static void main(String[] args) {
        DaoFactory postgresFactory = new PostgresDaoFactory();

        EmployeeDao employeeDao = postgresFactory.createEmployeeDao();
        employeeDao.getEmployeeById(1L);
    }

}
