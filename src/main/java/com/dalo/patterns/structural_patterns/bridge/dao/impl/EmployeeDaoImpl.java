package com.dalo.patterns.structural_patterns.bridge.dao.impl;

import com.dalo.patterns.structural_patterns.bridge.dao.EmployeeDao;
import com.dalo.patterns.structural_patterns.bridge.dao.StorageDao;
import com.dalo.patterns.structural_patterns.bridge.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
    private StorageDao<Employee> storageDao;

    public EmployeeDaoImpl(StorageDao<Employee> storageDao) {
        this.storageDao = storageDao;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        Employee newEmployee = storageDao.save(employee);
        return newEmployee;
    }

    @Override
    public StorageDao<Employee> getStorage() {
        return storageDao;
    }
}
