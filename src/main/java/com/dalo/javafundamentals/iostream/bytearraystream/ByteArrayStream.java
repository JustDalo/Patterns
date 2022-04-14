package com.dalo.javafundamentals.iostream.bytearraystream;

import org.apache.commons.io.FileUtils;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;

public class ByteArrayStream {
    public static void main(String[] args) {

        File file = new File("file.txt");
        ByteArrayInputStream byteArrayInputStream = null;
        try {
            byteArrayInputStream =
                    new ByteArrayInputStream(
                            FileUtils.readFileToByteArray(file));
            byteArrayInputStream.read();
        } catch (IOException ex) {
            //ignore
        } finally {
            if (byteArrayInputStream != null)
                try {
                    byteArrayInputStream.close();
                }
                catch(IOException e) {
                    //ignore
                }
            //or else
            //closeStream(byteArrayInputStream);
        }
    }

    private static void closeStream(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException ex) {
                // ignore
            }
        }
    }
}
