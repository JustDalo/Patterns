package com.dalo.patterns.creationalPatterns.factoryMethod.dao;

import com.dalo.patterns.creationalPatterns.factoryMethod.entity.Employee;

public interface EmployeeDao {
    Employee getEmployeeById(Long id);
    void deleteEmployee(Long id);
}
