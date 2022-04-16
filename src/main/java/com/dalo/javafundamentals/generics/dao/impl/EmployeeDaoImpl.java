package com.dalo.javafundamentals.generics.dao.impl;

import com.dalo.javafundamentals.generics.dao.EmployeeDao;
import com.dalo.javafundamentals.generics.model.Employee;

import java.util.Optional;

public class EmployeeDaoImpl extends DaoImpl<Employee> implements EmployeeDao {
    @Override
    public Optional<Employee> findEmployeeByName(String name) {
        return Optional.empty();
    }
}
