package com.dalo.patterns.behavioralPatterns.observer.event.impl;

import com.dalo.patterns.behavioralPatterns.observer.event.EventListener;

public class NotificationListener implements EventListener {
    @Override
    public void update(String something) {
        System.out.println(something);
    }
}
