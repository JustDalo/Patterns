package com.dalo.newspring.proxy.impl;

import com.dalo.newspring.proxy.ProxyConfigurator;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.InvocationHandler;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DeprecatedHandlerProxyConfigurator implements ProxyConfigurator {
    @Override
    public Object replaceWithProxyIfNeeded(Object t, Class implClass) {
        if (implClass.isAnnotationPresent(Deprecated.class)) {
            if (implClass.getInterfaces().length == 0) {
                return Enhancer.create(implClass, new InvocationHandler() {
                    @Override
                    public Object invoke(Object o, Method method, Object[] args) throws Throwable {
                        return getInvocationHandlerLogic(method, args, t);
                    }
                });
            }
            return Proxy.newProxyInstance(implClass.getClassLoader(), implClass.getInterfaces(),
                new java.lang.reflect.InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        return getInvocationHandlerLogic(method, args, t);
                    }
                });
        }
        return t;
    }

    private Object getInvocationHandlerLogic(
        Method method,
        Object[] args,
        Object t
    ) throws IllegalAccessException, InvocationTargetException {
        System.out.println("Call for deprecated method");
        try {
            return method.invoke(t, args);
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        throw new RuntimeException();
    }
}
