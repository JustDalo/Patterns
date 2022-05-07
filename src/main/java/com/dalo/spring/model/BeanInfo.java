package com.dalo.spring.model;

import java.lang.reflect.Type;

public class BeanInfo {
    private Type implementation;
    private boolean isSingleton;

    public BeanInfo(Type implementation, boolean isSingleton) {
        this.implementation = implementation;
        this.isSingleton = isSingleton;
    }

    public Type getImplementation() {
        return implementation;
    }

    public boolean isSingleton() {
        return isSingleton;
    }
}
