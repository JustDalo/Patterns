package com.dalo.newspring;

import com.dalo.newspring.controller.CustomController;
import com.dalo.newspring.service.Service1;
import com.dalo.newspring.service.impl.Service1Impl;
import com.dalo.newspring.utils.ObjectFactory;

public class Main {
    public static void main(String[] args) {
        CustomController controller = ObjectFactory.getInstance().createObject(CustomController.class);
        controller.test();
    }
}
