package com.dalo.patterns.creational_patterns.abstract_factory.factory;

import com.dalo.patterns.creational_patterns.abstract_factory.dao.ClientDao;
import com.dalo.patterns.creational_patterns.abstract_factory.dao.EmployeeDao;
import com.dalo.patterns.creational_patterns.abstract_factory.dao.postgres_impl.PostgresClientDao;
import com.dalo.patterns.creational_patterns.abstract_factory.dao.postgres_impl.PostgresEmployeeDao;

public class PostgresDaoFactory extends DaoFactory {

    @Override
    public EmployeeDao createEmployeeDao() {
        return new PostgresEmployeeDao();
    }

    @Override
    public ClientDao createClientDao() {
        return new PostgresClientDao();
    }
}
