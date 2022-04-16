package com.dalo.javafundamentals.classloading;

import java.io.*;
import java.lang.ClassLoader;

public class ClassLoaderFromFile extends ClassLoader {
    private final String binPath;

    public ClassLoaderFromFile(String binPath, ClassLoader parent) {
        super(parent);
        this.binPath = binPath;
    }

    @Override
    public Class<?> findClass(String className) throws ClassNotFoundException {
        try {
            byte[] b = fetchClass(binPath + className + ".class");
            return defineClass( className, b, 0, b.length);
        } catch (IOException e) {
            e.printStackTrace();
            return super.findClass(className);
        }

    }

    private byte[] fetchClass(String path) throws IOException {
        InputStream is = new FileInputStream(path);
        long length = new File(path).length();

        byte[] bytes = new byte[(int) length];

        int offset = 0;
        int numRead;
        while (offset < bytes.length
                && (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0) {
            offset += numRead;
        }
        if (offset < bytes.length) {
            throw new IOException("Could not completely read file " + path);
        }
        is.close();
        return bytes;

    }

}
