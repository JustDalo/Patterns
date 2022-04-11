package com.dalo.patterns.structural_patterns.composite.model;

public class FinancialDepartment implements Department{
    private Long id;
    private String name;

    public FinancialDepartment(String name) {
        this.name = name;
    }
    @Override
    public void printDepartmentName() {
        System.out.println(name);
    }
}
