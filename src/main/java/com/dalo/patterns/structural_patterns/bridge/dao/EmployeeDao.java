package com.dalo.patterns.structural_patterns.bridge.dao;

import com.dalo.patterns.structural_patterns.bridge.model.Employee;

public interface EmployeeDao {
    Employee saveEmployee(Employee employee);
    public StorageDao<Employee> getStorage();
}
