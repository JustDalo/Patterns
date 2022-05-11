package com.dalo.newspring.controller;

import com.dalo.newspring.annotation.InjectByType;
import com.dalo.newspring.service.Service1;
import com.dalo.newspring.service.Service2;

public class CustomController {
    @InjectByType
    Service1 service1;
    @InjectByType
    Service2 service2;

    public void test() {

    }
}
