package com.dalo.patterns.creational_patterns.factory_method.application;

import com.dalo.patterns.creational_patterns.factory_method.entity.Database;
import com.dalo.patterns.creational_patterns.factory_method.factory.DatabaseFactory;
import com.dalo.patterns.creational_patterns.factory_method.factory.MySqlFactory;

public class Application {
    public static void main(String[] args) {
        DatabaseFactory dbFactory = new MySqlFactory();
        Database database = dbFactory.createDatabase();
        database.getEmployeeById(1L);
    }
}
