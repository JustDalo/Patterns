package com.dalo.patterns.structural_patterns.decorator.decorator;

import com.dalo.patterns.structural_patterns.decorator.model.User;
import com.dalo.patterns.structural_patterns.decorator.service.UserService;

import java.util.List;

public class UserAgeFilterDecorator extends UserServiceDecorator {
    public UserAgeFilterDecorator(UserService service) {
        super(service);
    }

    @Override
    public List<User> getAllUsers() {
        return getUserByAge(super.getAllUsers());
    }

    private List<User> getUserByAge(List<User> users) {
        List<User> usersAgeFilter = null;
        for (User user : users) {
            if (user.getAge() >= 18) {
                usersAgeFilter.add(user);
            }
        }
        return usersAgeFilter;
    }
}
