package com.dalo.spring.beanprovider.impl;

import com.dalo.spring.beanconfiguration.BeanConfiguration;
import com.dalo.spring.beanprovider.BeanProvider;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.Map;

public class BeanProviderImpl implements BeanProvider {
    private final BeanConfiguration beanConfiguration;
    private Map<Type, Object> singletons;

    public BeanProviderImpl(BeanConfiguration beanConfiguration) {
        this.beanConfiguration = beanConfiguration;
    }

    @Override
    public Class<?> resolve() {
        return null;
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
        Constructor[] ctors = implementationType.getClass().getConstructors();
        Constructor ctor = null;

        for (int i = 0; i < ctors.length; i++) {
            ctor = ctors[i];
            if (ctor.getGenericParameterTypes().length == 0) {
                break;
            }
        }

        try {
            Object object = ctor.newInstance(new Object[] {});
            return object;
            // production code should handle these exceptions more gracefully
        } catch (InstantiationException x) {
            x.printStackTrace();
        } catch (InvocationTargetException x) {
            x.printStackTrace();
        } catch (IllegalAccessException x) {
            x.printStackTrace();
        }
        throw new IllegalArgumentException();
    }
}
