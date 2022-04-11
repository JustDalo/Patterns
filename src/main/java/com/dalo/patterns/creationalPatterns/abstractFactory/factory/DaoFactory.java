package com.dalo.patterns.creationalPatterns.abstractFactory.factory;

import com.dalo.patterns.creationalPatterns.abstractFactory.dao.ClientDao;
import com.dalo.patterns.creationalPatterns.abstractFactory.dao.EmployeeDao;

public abstract class DaoFactory {
    public static final int HASHTABLE = 1;
    public static final int POSTGRES = 2;

    public static DaoFactory getDaoFactory(int factory) {
        switch(factory) {
            case HASHTABLE:
                return new HashTableDaoFactory();
            case POSTGRES:
                return new PostgresDaoFactory();
            default:
                return null;
        }
    }

    public abstract EmployeeDao createEmployeeDao();
    public abstract ClientDao createClientDao();
}
