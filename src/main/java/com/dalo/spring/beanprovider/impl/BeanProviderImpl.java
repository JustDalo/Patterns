package com.dalo.spring.beanprovider.impl;

import com.dalo.spring.beanconfiguration.BeanConfiguration;
import com.dalo.spring.beanprovider.BeanProvider;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class BeanProviderImpl implements BeanProvider {
    private final BeanConfiguration beanConfiguration;
    private Map<Type, Object> singletons;

    public BeanProviderImpl(BeanConfiguration beanConfiguration) {
        this.beanConfiguration = beanConfiguration;
        singletons = new HashMap<>();
    }

    @Override
    public Class<?> resolve(Class<?> dependencyClass) {
        return createBean(dependencyClass).getClass();
    }

    private Object createBean(Type beanType) {
        if (!beanConfiguration.beans.containsKey(beanType)) {
            throw new IllegalArgumentException("The bean is not registered" + beanType);
        }
        if (beanConfiguration.beans.get(beanType).isSingleton()) {
            if (singletons.containsKey(beanType)) {
                return singletons.get(beanType);
            }
            var singletonResolution = createInstance(beanConfiguration.beans.get(beanType).getImplementation());
            singletons.put(beanType, singletonResolution);
            return singletonResolution;
        }

        var resolution = createInstance(beanConfiguration.beans.get(beanType).getImplementation());

        return resolution;
    }

    private Object createInstance(Type implementationType) {
        try {
            Class c = Class.forName(implementationType.getTypeName());
            return c.getDeclaredConstructor().newInstance();
        } catch (InstantiationException x) {
            x.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        throw new IllegalArgumentException();
    }
}
