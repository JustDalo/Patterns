package com.dalo.patterns.creationalPatterns.factoryMethod.application;

import com.dalo.patterns.creationalPatterns.factoryMethod.dao.EmployeeDao;
import com.dalo.patterns.creationalPatterns.factoryMethod.factory.DaoFactory;
import com.dalo.patterns.creationalPatterns.factoryMethod.factory.HashTableFactory;

public class Application {
    public static void main(String[] args) {
        DaoFactory dbFactory = new HashTableFactory();
        EmployeeDao database = dbFactory.createEmployeeDao();
        database.getEmployeeById(1L);
    }
}
