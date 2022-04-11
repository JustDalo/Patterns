package com.dalo.patterns.creationalPatterns.singleton.dao;

import com.dalo.patterns.creationalPatterns.pototype.model.Employee;

public interface EmployeeDao {
    Employee getEmployeeByName(String name);
}
