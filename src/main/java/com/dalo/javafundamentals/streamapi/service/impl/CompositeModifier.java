package com.dalo.javafundamentals.streamapi.service.impl;


import com.dalo.javafundamentals.streamapi.model.User;
import com.dalo.javafundamentals.streamapi.service.Modifier;
import one.util.streamex.StreamEx;

import java.util.List;
import java.util.function.Consumer;

public class CompositeModifier implements Modifier {
    private final List<Modifier> modifiers;
    public CompositeModifier(List<Modifier> modifierList) {
        modifiers = modifierList;
    }

    @Override
    public User modifyUser(User user) {
        return StreamEx.of(modifiers).foldLeft(user, (result, modifier) -> modifier.modifyUser(result));
    }

}
