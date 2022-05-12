package com.dalo.newspring.service.impl;

import com.dalo.newspring.annotation.InjectProperty;
import com.dalo.newspring.annotation.Singleton;
import com.dalo.newspring.service.Service2;

@Singleton
@Deprecated
public class Service2Impl implements Service2 {
    @InjectProperty("")
    private String field;

    @Override
    public void test() {
        System.out.println("Service 2");
    }
}
