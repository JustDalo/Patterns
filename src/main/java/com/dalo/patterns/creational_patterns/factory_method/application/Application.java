package com.dalo.patterns.creational_patterns.factory_method.application;

import com.dalo.patterns.creational_patterns.factory_method.dao.EmployeeDao;
import com.dalo.patterns.creational_patterns.factory_method.factory.DaoFactory;
import com.dalo.patterns.creational_patterns.factory_method.factory.HashTableFactory;

public class Application {
    public static void main(String[] args) {
        DaoFactory dbFactory = new HashTableFactory();
        EmployeeDao database = dbFactory.createEmployeeDao();
        database.getEmployeeById(1L);
    }
}
