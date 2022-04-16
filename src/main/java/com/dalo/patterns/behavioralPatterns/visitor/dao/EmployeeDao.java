package com.dalo.patterns.behavioralPatterns.visitor.dao;

import com.dalo.patterns.behavioralPatterns.visitor.model.Employee;

public interface EmployeeDao extends Dao<Employee> {
    Employee getEmployeeByFirstName(String firstName);
}
