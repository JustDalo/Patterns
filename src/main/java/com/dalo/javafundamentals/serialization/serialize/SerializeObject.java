package com.dalo.javafundamentals.serialization.serialize;

import com.dalo.javafundamentals.serialization.model.User;

import java.io.*;

public class SerializeObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = new User("Daniil", "Shyshla");

        FileOutputStream fileOutputStream
                = new FileOutputStream("yourfile.txt");
        ObjectOutputStream objectOutputStream
                = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(user);
        objectOutputStream.flush();
        objectOutputStream.close();

        FileInputStream fileInputStream
                = new FileInputStream("yourfile.txt");
        ObjectInputStream objectInputStream
                = new ObjectInputStream(fileInputStream);
        User user2 = (User) objectInputStream.readObject();
        objectInputStream.close();
    }
}
