package com.dalo.javafundamentals.streamapi.service.impl;


import com.dalo.javafundamentals.streamapi.model.User;
import com.dalo.javafundamentals.streamapi.service.Modifier;
import lombok.RequiredArgsConstructor;
import one.util.streamex.StreamEx;

import java.util.List;
import java.util.function.Consumer;

@RequiredArgsConstructor
public class CompositeModifier implements Modifier {
    private final List<Modifier> modifiers;

    @Override
    public User modifyUser(User user) {
        return StreamEx.of(modifiers).foldLeft(user, (result, modifier) -> modifier.modifyUser(result));
    }

}
