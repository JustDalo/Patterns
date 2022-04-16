package com.dalo.patterns.behavioralPatterns.visitor.dao.impl;

import com.dalo.patterns.behavioralPatterns.visitor.dao.EmployeeDao;
import com.dalo.patterns.behavioralPatterns.visitor.model.Employee;
import com.dalo.patterns.behavioralPatterns.visitor.visitor.Visitor;

public class EmployeeDaoImpl extends DaoImpl<Employee> implements EmployeeDao {
    @Override
    public Employee getEmployeeByFirstName(String firstName) {
        return null;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitEmployeeDao(this);
    }
}
