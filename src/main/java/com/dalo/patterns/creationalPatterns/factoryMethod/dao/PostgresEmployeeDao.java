package com.dalo.patterns.creationalPatterns.factoryMethod.dao;

import com.dalo.patterns.creationalPatterns.factoryMethod.entity.Employee;

public class PostgresEmployeeDao implements EmployeeDao {
    @Override
    public Employee getEmployeeById(Long id) {
        return null;
    }

    @Override
    public void deleteEmployee(Long id) {

    }
}
