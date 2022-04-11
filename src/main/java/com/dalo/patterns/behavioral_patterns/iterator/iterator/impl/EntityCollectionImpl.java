package com.dalo.patterns.behavioral_patterns.iterator.iterator.impl;

import com.dalo.patterns.behavioral_patterns.iterator.iterator.EntityCollection;
import com.dalo.patterns.behavioral_patterns.iterator.iterator.EntityIterator;

import java.util.ArrayList;

public class EntityCollectionImpl implements EntityCollection {
    EntityIterator entityIterator;
    @Override
    public EntityIterator getIterator() {
        entityIterator = new EntityIteratorImpl(new ArrayList<>());
        return entityIterator;
    }
}
