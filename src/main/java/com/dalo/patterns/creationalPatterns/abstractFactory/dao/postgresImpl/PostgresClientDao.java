package com.dalo.patterns.creationalPatterns.abstractFactory.dao.postgresImpl;

import com.dalo.patterns.creationalPatterns.abstractFactory.dao.ClientDao;
import com.dalo.patterns.creationalPatterns.abstractFactory.entity.Employee;

public class PostgresClientDao implements ClientDao {
    @Override
    public Employee getClientById(Long id) {
        return null;
    }
}
