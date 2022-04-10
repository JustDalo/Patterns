package com.dalo.patterns.structural_patterns.bridge.app;

import com.dalo.patterns.structural_patterns.bridge.dao.EmployeeDao;
import com.dalo.patterns.structural_patterns.bridge.dao.impl.EmployeeDaoImpl;
import com.dalo.patterns.structural_patterns.bridge.dao.impl.HashTableDaoImpl;
import com.dalo.patterns.structural_patterns.bridge.model.Employee;

public class Application {
    public static void main(String[] args) {
        EmployeeDao employeeDao = new EmployeeDaoImpl(new HashTableDaoImpl<>());
        employeeDao.saveEmployee(new Employee());
    }
}
