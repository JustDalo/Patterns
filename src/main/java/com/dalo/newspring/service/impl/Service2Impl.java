package com.dalo.newspring.service.impl;

import com.dalo.newspring.annotation.InjectProperty;
import com.dalo.newspring.annotation.Singleton;

@Singleton
public class Service2Impl {
    @InjectProperty("")
    private String field;

    public void test() {
        System.out.println("Service 2");
    }
}
