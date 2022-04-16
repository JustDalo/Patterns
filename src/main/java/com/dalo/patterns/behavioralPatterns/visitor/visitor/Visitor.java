package com.dalo.patterns.behavioralPatterns.visitor.visitor;

import com.dalo.patterns.behavioralPatterns.visitor.dao.EmployeeDao;
import com.dalo.patterns.behavioralPatterns.visitor.dao.UserDao;

public interface Visitor {
    String visitEmployeeDao(EmployeeDao employeeDao);
    String visitUserDao(UserDao userDao);
}
