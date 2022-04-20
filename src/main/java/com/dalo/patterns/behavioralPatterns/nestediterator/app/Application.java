package com.dalo.patterns.behavioralPatterns.nestediterator.app;

import com.dalo.patterns.behavioralPatterns.nestediterator.iterator.Iterator;
import com.dalo.patterns.behavioralPatterns.nestediterator.iterator.impl.NestedIterator;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class Application {
    private static Iterator iterator;
    public static void main(String[] args) {
        List nestedList = new ArrayList<>();

        nestedList.add("0");

        nestedList.add(asList("1", asList("2", asList("3", "4"))));
        nestedList.add("5");

        iterator = new NestedIterator(nestedList);

        while (iterator.hasNext()) {
            System.out.print(iterator.getNext() + " ");
        }
        System.out.println();
        System.out.println(nestedList);
    }
}
