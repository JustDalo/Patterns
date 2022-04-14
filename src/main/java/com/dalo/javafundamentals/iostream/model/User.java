package com.dalo.javafundamentals.serialization.model;

import java.io.Serializable;

public class User implements Serializable {
    private transient Long id;
    private String firstName;
    private String lastName;

    public User() {

    }
    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
