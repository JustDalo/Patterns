package com.dalo.patterns.behavioralPatterns.strategy.strategy.impl;

import com.dalo.patterns.behavioralPatterns.strategy.strategy.ExceptionRule;

public class HashTableException implements ExceptionRule {
    @Override
    public void resolve() {
        System.out.println("HashTable");
    }
}
