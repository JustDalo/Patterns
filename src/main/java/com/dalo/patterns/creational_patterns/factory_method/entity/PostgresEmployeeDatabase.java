package com.dalo.patterns.creational_patterns.factory_method.entity;


public class PostgresEmployeeDatabase implements Database {
    @Override
    public Employee getEmployeeById(Long id) {
        return null;
    }

    @Override
    public void deleteEmployee(Long id) {

    }
}
