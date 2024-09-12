package com.dalo.patterns.structural_patterns.decorator.service;

import com.dalo.patterns.structural_patterns.decorator.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
}
