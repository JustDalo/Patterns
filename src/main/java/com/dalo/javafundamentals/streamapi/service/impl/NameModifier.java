package com.dalo.javafundamentals.streamapi.service.impl;

import com.dalo.javafundamentals.streamapi.model.User;
import com.dalo.javafundamentals.streamapi.service.Modifier;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class NameModifier implements Modifier {
    private final String name;

    @Override
    public User modifyUser(User user) {
        var userFirstName = user.getFirstName() + name;
        return new User(userFirstName, user.getLastName());
    }
}
