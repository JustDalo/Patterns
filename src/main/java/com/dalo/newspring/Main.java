package com.dalo.newspring;

import com.dalo.newspring.controller.CustomController;
import com.dalo.newspring.service.Service1;
import com.dalo.newspring.service.impl.Service1Impl;
import com.dalo.newspring.utils.Application;
import com.dalo.newspring.utils.ApplicationContext;
import com.dalo.newspring.utils.ObjectFactory;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = Application.run("com.dalo.newspring", new HashMap<>(Map.of(Service1.class,
            Service1Impl.class)));
        CustomController controller = context.getObject(CustomController.class);
        controller.test();
    }
}
