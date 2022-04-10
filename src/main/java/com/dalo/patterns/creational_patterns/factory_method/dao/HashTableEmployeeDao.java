package com.dalo.patterns.creational_patterns.factory_method.dao;

import com.dalo.patterns.creational_patterns.factory_method.dao.EmployeeDao;
import com.dalo.patterns.creational_patterns.factory_method.entity.Employee;

public class HashTableEmployeeDao implements EmployeeDao {
    @Override
    public Employee getEmployeeById(Long id) {
        return null;
    }

    @Override
    public void deleteEmployee(Long id) {

    }
}
