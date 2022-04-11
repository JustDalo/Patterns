package com.dalo.patterns.behavioral_patterns.strategy.strategy.impl;

import com.dalo.patterns.behavioral_patterns.strategy.strategy.ExceptionRule;

public class HashTableException implements ExceptionRule {
    @Override
    public void resolve() {
        System.out.println("HashTable");
    }
}
