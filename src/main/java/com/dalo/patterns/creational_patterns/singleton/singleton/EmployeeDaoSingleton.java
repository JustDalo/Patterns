package com.dalo.patterns.creational_patterns.singleton.singleton;

import com.dalo.patterns.creational_patterns.singleton.dao.EmployeeDao;
import com.dalo.patterns.creational_patterns.singleton.dao.impl.EmployeeDaoImpl;

public class EmployeeDaoSingleton {
    private final EmployeeDao employeeDao = new EmployeeDaoImpl();

    private EmployeeDaoSingleton() {
    }

    public EmployeeDao getEmployeeDaoInstance() {
        return employeeDao;
    }
    public static EmployeeDaoSingleton getInstance() {
        return Holder.INSTANCE;
    }

    private static class Holder {
        static final EmployeeDaoSingleton INSTANCE = new EmployeeDaoSingleton();
    }
}
