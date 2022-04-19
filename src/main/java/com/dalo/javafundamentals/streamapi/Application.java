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
        int[] steam = Stream.of("12", "44").mapToInt(Integer::parseInt).toArray();
        Modifier nameModifier = new NameModifier("Kate");
        Modifier nameModifier1 = new NameModifier("Daniil");

        List<Modifier> modifiers = new ArrayList<>();
        modifiers.add(nameModifier);
        modifiers.add(nameModifier1);

        Modifier compositeModifier = new CompositeModifier(modifiers);

        User user = new User("Daniil", "Shyshla");

        System.out.println(compositeModifier.modifyUser(user).toString());
    }
}
