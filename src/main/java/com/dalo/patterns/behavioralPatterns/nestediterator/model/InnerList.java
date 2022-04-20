package com.dalo.patterns.behavioralPatterns.nestediterator.model;

import java.util.List;

public class InnerList {
    private final List list;
    private int currentPosition = 0;

    public InnerList(List list) {
        this.list = list;
    }

    public List getList() {
        return list;
    }
    public int getCurrentPosition() {
        return currentPosition;
    }
    public void incPosition() {
        currentPosition++;
    }
}
