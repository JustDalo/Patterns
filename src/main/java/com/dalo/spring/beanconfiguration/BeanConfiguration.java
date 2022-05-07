package com.dalo.spring.beanconfiguration;

import com.dalo.spring.model.BeanInfo;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

public abstract class BeanConfiguration {
    public Map<Type, BeanInfo> beans;

    protected abstract void register(Type dependency, Type implementation, boolean isSingleton);
}
