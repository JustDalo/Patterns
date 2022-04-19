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
        String userFirstName = user.getFirstName() + name;
        user.setFirstName(userFirstName);
        return user;
    }
}
