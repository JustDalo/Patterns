package com.dalo.newspring.service.impl;

import com.dalo.newspring.service.Service2;
import com.dalo.newspring.annotation.InjectByType;

public class Service1Impl {
    @InjectByType
    private Service2 service2;

    public void test() {
        System.out.println("Service 1");
    }
}
