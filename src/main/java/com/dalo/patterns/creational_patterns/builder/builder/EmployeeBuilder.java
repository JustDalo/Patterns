package com.dalo.patterns.creational_patterns.builder.builder;

import com.dalo.patterns.creational_patterns.builder.model.Employee;

public class EmployeeBuilder {
    private Employee employee;

    public EmployeeBuilder() {
        this.employee = new Employee();
    }

    public void addFirstName(String firstName) {
        employee.setFirstName(firstName);
    }
    public void addLastName(String lastName) {
        employee.setLastName(lastName);
    }
    public void addPhoneNumber(String phoneNumber) {
        employee.setPhoneNumber(phoneNumber);
    }
    public Employee build() {
        return this.employee;
    }

}
