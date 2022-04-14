package com.dalo.javafundamentals.iostream.filestream;

import com.dalo.javafundamentals.iostream.model.User;

import java.io.*;

public class FileStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = new User("Daniil", "Shyshla");

        FileOutputStream fileOutputStream
                = new FileOutputStream("file.txt");
        ObjectOutputStream objectOutputStream
                = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(user);
        objectOutputStream.flush();
        objectOutputStream.close();

        FileInputStream fileInputStream
                = new FileInputStream("file.txt");
        ObjectInputStream objectInputStream
                = new ObjectInputStream(fileInputStream);
        User user2 = (User) objectInputStream.readObject();
        objectInputStream.close();
    }
}
