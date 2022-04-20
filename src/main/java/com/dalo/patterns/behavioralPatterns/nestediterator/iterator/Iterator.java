package com.dalo.patterns.behavioralPatterns.nestediterator.iterator;

public interface Iterator<T> {
    boolean hasNext();

    T getNext();

    void reset();
}
