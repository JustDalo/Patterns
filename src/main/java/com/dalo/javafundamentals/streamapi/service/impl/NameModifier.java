package com.dalo.javafundamentals.streamapi.service.impl;

import com.dalo.javafundamentals.streamapi.model.User;
import com.dalo.javafundamentals.streamapi.service.Modifier;

public class NameModifier implements Modifier {
    private String name;

    public NameModifier(String name) {
        this.name = name;
    }

    @Override
    public User modifyUser(User user) {
        var userFirstName = user.getFirstName() + name;
        return new User(userFirstName, user.getLastName());
    }
}
