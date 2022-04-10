package com.dalo.patterns.creational_patterns.factory_method.factory;

import com.dalo.patterns.creational_patterns.factory_method.entity.Database;
import com.dalo.patterns.creational_patterns.factory_method.entity.PostgresEmployeeDatabase;

public class PostgresFactory extends DatabaseFactory {
    @Override
    public Database createDatabase() {
        return new PostgresEmployeeDatabase();
    }
}
