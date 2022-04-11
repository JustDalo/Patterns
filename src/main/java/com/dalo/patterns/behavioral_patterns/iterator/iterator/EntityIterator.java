package com.dalo.patterns.behavioral_patterns.iterator.iterator;

import com.dalo.patterns.behavioral_patterns.iterator.model.Entity;

public interface EntityIterator {
    boolean hasNext();
    Entity getNext();
    void reset();
}
