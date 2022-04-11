package com.dalo.patterns.structural_patterns.adapter.adapter;

import com.dalo.patterns.structural_patterns.adapter.service.UserService;
import com.dalo.patterns.structural_patterns.adapter.service.impl.UserServiceOldImpl;

public class UserAdapter implements UserService {
    @Override
    public void SomeNewMethod() {
        UserServiceOldImpl userServiceOld = new UserServiceOldImpl();
        userServiceOld.SomeOldMethod();
    }
}
