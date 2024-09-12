package com.dalo.patterns.structural_patterns.proxy.dao;

import com.dalo.patterns.structural_patterns.proxy.model.Employee;

public interface EmployeeDao {
    Employee getEmployeeByName(String name);
}
