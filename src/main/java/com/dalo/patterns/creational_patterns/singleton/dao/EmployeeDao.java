package com.dalo.patterns.creational_patterns.singleton.dao;

import com.dalo.patterns.creational_patterns.pototype.model.Employee;

public interface EmployeeDao {
    Employee getEmployeeByName(String name);
}
