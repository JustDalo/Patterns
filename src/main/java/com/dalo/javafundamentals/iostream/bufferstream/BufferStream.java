package com.dalo.javafundamentals.iostream.bufferstream;

import com.dalo.javafundamentals.iostream.model.User;

import java.io.*;

public class BufferStream {
    public static void main(String[] args) throws IOException {
        User user = new User("Daniil", "Shyshla");

        FileOutputStream fileOutputStream
                = new FileOutputStream("file.txt");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();

        FileInputStream fileInputStream
                = new FileInputStream("file.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        bufferedInputStream.close();
    }
}
