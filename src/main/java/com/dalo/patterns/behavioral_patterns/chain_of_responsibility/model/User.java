package com.dalo.patterns.behavioral_patterns.chain_of_responsibility.model;

public class User {
    private Long id;
    private String email;
    private String password;

    public User() {

    }

    public User(String email, String password) {
        this.email = email;
        this.password = email;
    }
}
