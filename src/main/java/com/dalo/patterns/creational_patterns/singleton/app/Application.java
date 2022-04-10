package com.dalo.patterns.creational_patterns.singleton.app;

import com.dalo.patterns.creational_patterns.singleton.dao.EmployeeDao;
import com.dalo.patterns.creational_patterns.singleton.singleton.EmployeeDaoSingleton;

public class Application {
    private final EmployeeDao employeeDao = EmployeeDaoSingleton.getInstance().getEmployeeDaoInstance();
}
