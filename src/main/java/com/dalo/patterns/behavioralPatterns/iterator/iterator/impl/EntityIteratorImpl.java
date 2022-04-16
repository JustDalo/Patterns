package com.dalo.patterns.behavioralPatterns.iterator.iterator.impl;

import com.dalo.patterns.behavioralPatterns.iterator.iterator.EntityIterator;
import com.dalo.patterns.behavioralPatterns.iterator.model.Entity;

import java.util.List;

public class EntityIteratorImpl implements EntityIterator {
    private List<Entity> entities;
    private int currentPosition = 0;

    public EntityIteratorImpl(List<Entity> entities) {
        this.entities = entities;
    }

    @Override
    public boolean hasNext() {
        return currentPosition < entities.size();
    }

    @Override
    public Entity getNext() {
        if (!hasNext())
            return null;
        Entity entity = entities.get(currentPosition);
        currentPosition += 1;
        return entity;
    }

    @Override
    public void reset() {
        currentPosition = 0;
    }
}
