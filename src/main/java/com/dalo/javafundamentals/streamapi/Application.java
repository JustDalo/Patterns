package com.dalo.javafundamentals.streamapi;

import com.dalo.javafundamentals.streamapi.model.User;
import com.dalo.javafundamentals.streamapi.service.Modifier;
import com.dalo.javafundamentals.streamapi.service.impl.CompositeModifier;
import com.dalo.javafundamentals.streamapi.service.impl.NameModifier;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Application {
    public static void main(String[] args) {
        var nameModifier = new NameModifier("Kate");
        var nameModifier1 = new NameModifier("Daniil");

        var modifiers = new ArrayList<Modifier>();
        modifiers.add(nameModifier);
        modifiers.add(nameModifier1);

        var compositeModifier = new CompositeModifier(modifiers);

        var user = new User("Daniil", "Shyshla");

        System.out.println(compositeModifier.modifyUser(user).toString());
    }
}
