package com.dalo.newspring.utils.impl;

import com.dalo.newspring.annotation.InjectByType;
import com.dalo.newspring.utils.ApplicationContext;
import com.dalo.newspring.utils.ObjectConfigurator;
import com.dalo.newspring.utils.ObjectFactory;
import lombok.SneakyThrows;

import java.lang.reflect.Field;

public class InjectByTypeAnnotationObjectConfigurator implements ObjectConfigurator {
    @Override
    public void configure(Object t, ApplicationContext context) {
        for (Field field : t.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(InjectByType.class)) {
                field.setAccessible(true);
            }
        }
    }
}
