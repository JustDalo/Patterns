package com.dalo.patterns.creationalPatterns.abstractFactory.dao;

import com.dalo.patterns.creationalPatterns.abstractFactory.entity.Employee;

public interface ClientDao {
    Employee getClientById(Long id);
}
