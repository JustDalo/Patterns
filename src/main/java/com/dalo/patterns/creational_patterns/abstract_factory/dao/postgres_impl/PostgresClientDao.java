package com.dalo.patterns.creational_patterns.abstract_factory.dao.postgres_impl;

import com.dalo.patterns.creational_patterns.abstract_factory.dao.ClientDao;
import com.dalo.patterns.creational_patterns.abstract_factory.entity.Employee;

public class PostgresClientDao implements ClientDao {
    @Override
    public Employee getClientById(Long id) {
        return null;
    }
}
