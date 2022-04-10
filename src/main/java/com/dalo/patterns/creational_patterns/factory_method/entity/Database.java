package com.dalo.patterns.creational_patterns.factory_method.entity;

public interface Database {
    Employee getEmployeeById(Long id);
    void deleteEmployee(Long id);
}
