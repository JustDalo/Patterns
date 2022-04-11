package com.dalo.patterns.structural_patterns.decorator.decorator;

import com.dalo.patterns.structural_patterns.decorator.model.User;
import com.dalo.patterns.structural_patterns.decorator.service.UserService;

import java.util.List;

public class UserServiceDecorator implements UserService {
    private UserService wrapper;

    public UserServiceDecorator(UserService service) {
        wrapper = service;
    }

    @Override
    public List<User> getAllUsers() {
        return wrapper.getAllUsers();
    }
}
