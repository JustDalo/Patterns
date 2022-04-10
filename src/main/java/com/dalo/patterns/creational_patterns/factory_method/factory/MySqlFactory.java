package com.dalo.patterns.creational_patterns.factory_method.factory;

import com.dalo.patterns.creational_patterns.factory_method.entity.Database;
import com.dalo.patterns.creational_patterns.factory_method.entity.MySqlEmployeeDatabase;

public class MySqlFactory extends DatabaseFactory {

    @Override
    public Database createDatabase() {
        return new MySqlEmployeeDatabase();
    }
}
