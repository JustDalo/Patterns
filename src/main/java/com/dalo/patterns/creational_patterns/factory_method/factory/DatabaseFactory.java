package com.dalo.patterns.creational_patterns.factory_method.factory;

import com.dalo.patterns.creational_patterns.factory_method.entity.Database;

public abstract class DatabaseFactory {
    public abstract Database createDatabase();
}
