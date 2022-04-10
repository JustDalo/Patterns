package com.dalo.patterns.creational_patterns.factory_method.entity;

public class MySqlEmployeeDatabase implements Database {
    @Override
    public Employee getEmployeeById(Long id) {
        return null;
    }

    @Override
    public void deleteEmployee(Long id) {

    }
}
