package com.dalo.patterns.structural_patterns.facade.dao;

import com.dalo.patterns.structural_patterns.facade.model.User;

public interface UserDao {
    User getUserById(Long id);
}
