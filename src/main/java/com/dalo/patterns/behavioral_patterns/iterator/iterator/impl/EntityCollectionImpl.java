package com.dalo.patterns.behavioral_patterns.iterator.iterator.impl;

import com.dalo.patterns.behavioral_patterns.iterator.iterator.EntityCollection;
import com.dalo.patterns.behavioral_patterns.iterator.iterator.EntityIterator;

public class EntityCollectionImpl implements EntityCollection {
    EntityIterator entityIterator;
    @Override
    public EntityIterator getIterator() {
        entityIterator = new EntityIteratorImpl();
        return entityIterator;
    }
}
