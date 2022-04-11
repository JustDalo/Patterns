package com.dalo.patterns.structural_patterns.composite.model;

public class SalesDepartment implements Department {
    private Long id;
    private String name;

    public SalesDepartment(String name) {
        this.name = name;
    }
    @Override
    public void printDepartmentName() {
        System.out.println(name);
    }
}
