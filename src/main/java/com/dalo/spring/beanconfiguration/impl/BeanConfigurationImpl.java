package com.dalo.spring.beanconfiguration.impl;

import com.dalo.spring.beanconfiguration.BeanConfiguration;
import com.dalo.spring.model.BeanInfo;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BeanConfigurationImpl extends BeanConfiguration {
    @Override
    public void register(Type dependency, Type implementation, boolean isSingleton) {
        if (!beans.containsKey(dependency)) {
            beans.put(dependency, new BeanInfo(implementation, isSingleton));
        }
    }
}
