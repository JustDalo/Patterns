package com.dalo.patterns.creationalPatterns.abstractFactory.dao;

import com.dalo.patterns.creationalPatterns.abstractFactory.entity.Employee;

public interface EmployeeDao {
    Employee getEmployeeById(Long id);
}
