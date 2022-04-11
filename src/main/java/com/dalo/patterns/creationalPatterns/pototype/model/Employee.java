package com.dalo.patterns.creationalPatterns.pototype.model;

public class Employee {
    private Long id;
    private String firstName;
    private String lastName;

    public Employee() {

    }
    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee copy() {
        Employee employeeClone = new Employee(this.firstName, this.lastName);
        return employeeClone;
    }
}
