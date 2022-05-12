package com.dalo.newspring.service.impl;

import com.dalo.newspring.service.Service2;
import com.dalo.newspring.annotation.InjectByType;

import javax.annotation.PostConstruct;

public class Service1Impl {
    @InjectByType
    private Service2 service2;

    @PostConstruct
    public void init() {
        System.out.println(getClass());
    }

    public void test() {
        System.out.println("Service 1");
    }
}
