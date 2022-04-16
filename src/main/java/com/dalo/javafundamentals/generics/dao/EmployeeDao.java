package com.dalo.javafundamentals.generics.dao;

import com.dalo.javafundamentals.generics.model.Employee;

import java.util.Optional;

public interface EmployeeDao extends Dao<Employee> {
    Optional<Employee> findEmployeeByName(String name);
}
