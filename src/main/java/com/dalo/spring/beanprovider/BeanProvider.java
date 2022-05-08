package com.dalo.spring.beanprovider;

public interface BeanProvider {
    Class<?> resolve(Class<?> dependencyClass);
}
