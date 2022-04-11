package com.dalo.patterns.creationalPatterns.abstractFactory.dao.postgresImpl;

import com.dalo.patterns.creationalPatterns.abstractFactory.dao.EmployeeDao;
import com.dalo.patterns.creationalPatterns.abstractFactory.entity.Employee;

public class PostgresEmployeeDao implements EmployeeDao {

    @Override
    public Employee getEmployeeById(Long id) {
        return null;
    }
}
