package com.dalo.newspring.utils;

import com.dalo.newspring.config.Config;
import com.dalo.newspring.config.impl.JavaConfig;
import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ObjectFactory {
    private static ObjectFactory ourInstance = new ObjectFactory();
    private List<ObjectConfigurator> configurators = new ArrayList<>();
    private Config config;

    public static ObjectFactory getInstance() { return ourInstance; }

    @SneakyThrows
    private ObjectFactory() {
        config = new JavaConfig("com.dalo.newspring", new HashMap<>());
        for (Class<? extends ObjectConfigurator> aClass : config.getScanner().getSubTypesOf(ObjectConfigurator.class)) {
            configurators.add(aClass.getDeclaredConstructor().newInstance());
        }
    }

    @SneakyThrows
    public <T> T createObject(Class<T> type) {
        Class<? extends T> implClass = type;
        if (type.isInterface()) {
            implClass = config.getImplClass(type);
        }

        T t = implClass.getDeclaredConstructor().newInstance();

        for (ObjectConfigurator objectConfigurator : configurators) {
            objectConfigurator.configure(t);
        }

        return t;
    }
}
