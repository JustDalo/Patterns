package com.dalo.javafundamentals.streamapi.model;


import lombok.Data;

@Data
public class User {
    private Long id;
    private String firstName;
    private String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
