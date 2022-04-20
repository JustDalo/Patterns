package com.dalo.patterns.behavioralPatterns.nestediterator.iterator.impl;

import com.dalo.patterns.behavioralPatterns.nestediterator.iterator.Iterator;
import com.dalo.patterns.behavioralPatterns.nestediterator.model.InnerList;

import java.util.ArrayDeque;
import java.util.List;

public class NestedIterator implements Iterator<String> {
    private final List nestedList;
    private final ArrayDeque<InnerList> innerLists;

    public NestedIterator(List nestedList) {
        this.nestedList = nestedList;
        innerLists = new ArrayDeque<>();
        innerLists.add(new InnerList(nestedList));
    }


    @Override
    public boolean hasNext() {
        return !innerLists.isEmpty();
    }

    @Override
    public String getNext() {
        if (!hasNext()) {
            return null;
        }

        InnerList list = innerLists.peek();
        if (list.getCurrentPosition() >= list.getList().size()) {
            innerLists.pop();
            return this.getNext();
        }
        Object listElement = list.getList().get(list.getCurrentPosition());

        if (listElement instanceof String) {
            list.incPosition();
            return listElement.toString();
        }
        else {
            innerLists.addFirst(new InnerList((List) listElement));
            list.incPosition();
            return this.getNext();
        }
    }

    @Override
    public void reset() {
        innerLists.clear();
        innerLists.add(new InnerList(nestedList));
    }
}
