package com.dalo.patterns.creational_patterns.factory_method.dao;

import com.dalo.patterns.creational_patterns.factory_method.entity.Employee;

public interface EmployeeDao {
    Employee getEmployeeById(Long id);
    void deleteEmployee(Long id);
}
