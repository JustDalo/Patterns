package com.dalo.patterns.creationalPatterns.singleton.app;

import com.dalo.patterns.creationalPatterns.singleton.dao.EmployeeDao;
import com.dalo.patterns.creationalPatterns.singleton.singleton.EmployeeDaoSingleton;

public class Application {
    private final EmployeeDao employeeDao = EmployeeDaoSingleton.getInstance().getEmployeeDaoInstance();
}
