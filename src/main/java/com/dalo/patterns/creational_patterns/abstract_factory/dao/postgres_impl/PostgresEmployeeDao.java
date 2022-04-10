package com.dalo.patterns.creational_patterns.abstract_factory.dao.postgres_impl;

import com.dalo.patterns.creational_patterns.abstract_factory.dao.EmployeeDao;
import com.dalo.patterns.creational_patterns.abstract_factory.entity.Employee;

public class PostgresEmployeeDao implements EmployeeDao {

    @Override
    public Employee getEmployeeById(Long id) {
        return null;
    }
}
