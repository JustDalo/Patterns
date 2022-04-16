package com.dalo.javafundamentals.classloading;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

public class ClassLoading {
    private static final String ABSOLUTE_PATH = "D:\\Internship\\MockModule\\target\\classes\\module\\";

    public static void main(String[] args) {
        ClassLoaderFromFile classLoader = new ClassLoaderFromFile(
                ABSOLUTE_PATH,
                ClassLoader.getSystemClassLoader());

        File dir = new File(ABSOLUTE_PATH);
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
