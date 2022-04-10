package com.dalo.patterns.creational_patterns.abstract_factory.dao;

import com.dalo.patterns.creational_patterns.abstract_factory.entity.Employee;

public interface ClientDao {
    Employee getClientById(Long id);
}
