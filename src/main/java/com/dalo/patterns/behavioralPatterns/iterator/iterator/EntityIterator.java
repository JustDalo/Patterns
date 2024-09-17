package com.dalo.patterns.behavioralPatterns.iterator.iterator;

import com.dalo.patterns.behavioralPatterns.iterator.model.Entity;

public interface EntityIterator {
    boolean hasNext();
    Entity getNext();
    void reset();
}
