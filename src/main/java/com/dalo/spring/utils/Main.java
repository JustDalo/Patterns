package com.dalo.spring.utils;

import com.dalo.spring.beanconfiguration.BeanConfiguration;
import com.dalo.spring.beanconfiguration.impl.BeanConfigurationImpl;
import com.dalo.spring.beanprovider.BeanProvider;
import com.dalo.spring.beanprovider.impl.BeanProviderImpl;

import java.lang.reflect.Type;

public class Main {
    public static void main(String[] args) {
        BeanConfigurationImpl beanConfiguration = new BeanConfigurationImpl();
        beanConfiguration.register(Service.class, ServiceImpl.class, true);

        BeanProvider beanProvider = new BeanProviderImpl(beanConfiguration);
        beanProvider.resolve(Service.class);
    }
}
