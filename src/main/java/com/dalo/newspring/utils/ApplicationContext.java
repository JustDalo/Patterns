package com.dalo.newspring.utils;

import com.dalo.newspring.annotation.Singleton;
import com.dalo.newspring.config.Config;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ApplicationContext {
    private ObjectFactory factory;
    private Map<Class, Object> cache = new ConcurrentHashMap<>();
    private Config config;

    public ApplicationContext(Config config) {
        this.config = config;
    }

    public <T> T getObject(Class<T> type) {
        Class<? extends T> implClass = type;
        if (cache.containsKey(type)) {
            return (T) cache.get(type);
        }

        if (type.isInterface()) {
            implClass = config.getImplClass(type);
        }
        T t = factory.createObject(implClass);

        if (implClass.isAnnotationPresent(Singleton.class)) {
            cache.put(type, implClass);
        }
        return t;
    }
}
