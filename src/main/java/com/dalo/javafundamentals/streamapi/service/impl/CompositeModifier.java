package com.dalo.javafundamentals.streamapi.service.impl;


import com.dalo.javafundamentals.streamapi.model.User;
import com.dalo.javafundamentals.streamapi.service.Modifier;

import java.util.List;
import java.util.function.Consumer;

public class CompositeModifier implements Modifier {
    private List<Modifier> modifiers;
    public CompositeModifier(List<Modifier> modifierList) {
        modifiers = modifierList;
    }

    @Override
    public User modifyUser(User user) {

        modifiers.stream().forEach(n -> {
            n.modifyUser(user);
        });

        return user;
    }

}
