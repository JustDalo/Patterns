package com.dalo.javafundamentals.classloading;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

public class ClassLoading {
    public static void main(String[] args) {
        String modulePath = "Your path";
        ClassLoaderFromFile classLoader = new ClassLoaderFromFile(
                modulePath,
                ClassLoader.getSystemClassLoader());

        File dir = new File(modulePath);
        String[] modules = dir.list();

        if (modules != null) {
            for (String module: modules) {
                try {
                    String moduleName = module.split(".class")[0];
                    Class<?> loadedClass = classLoader.findClass(moduleName);
                    Module execute = (Module) loadedClass.getDeclaredConstructor().newInstance();
                    execute.printStatus();
                } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException ex) {
                    ex.printStackTrace();
                }
            }
        }

    }
}
