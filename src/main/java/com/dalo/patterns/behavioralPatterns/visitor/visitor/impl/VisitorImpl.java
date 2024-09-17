package com.dalo.patterns.behavioralPatterns.visitor.visitor.impl;

import com.dalo.patterns.behavioralPatterns.visitor.dao.EmployeeDao;
import com.dalo.patterns.behavioralPatterns.visitor.dao.UserDao;
import com.dalo.patterns.behavioralPatterns.visitor.visitor.Visitor;

public class VisitorImpl implements Visitor {
    @Override
    public String visitEmployeeDao(EmployeeDao employeeDao) {
        //logic
        return null;
    }

    @Override
    public String visitUserDao(UserDao userDao) {
        //logic
        return null;
    }
}
