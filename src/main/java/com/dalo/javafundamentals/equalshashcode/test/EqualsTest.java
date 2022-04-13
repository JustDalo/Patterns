package com.dalo.javafundamentals.equalshashcode.test;


import com.dalo.javafundamentals.equalshashcode.model.User;

public class EqualsTest {

    public static void main(String[] args) {
        User user1 = new User("Daniil", "Shyshla");
        User user2 = new User("Daniil", "Shyshla");
        if (user1.equals(user2)) {
            System.out.println("true");
        }
    }
}
