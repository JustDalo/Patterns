package com.dalo.newspring.service.impl;

import com.dalo.newspring.service.Service1;
import com.dalo.newspring.service.Service2;
import com.dalo.newspring.annotation.InjectByType;

import javax.annotation.PostConstruct;

public class Service1Impl implements Service1 {
    @InjectByType
    private Service2 service2;

    @PostConstruct
    public void init() {
        System.out.println(getClass());
    }

    @Override
    public void test() {
        System.out.println("Service 1");
    }
}
