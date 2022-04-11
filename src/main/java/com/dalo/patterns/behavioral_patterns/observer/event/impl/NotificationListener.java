package com.dalo.patterns.behavioral_patterns.observer.event.impl;

import com.dalo.patterns.behavioral_patterns.observer.event.EventListener;

public class NotificationListener implements EventListener {
    @Override
    public void update(String something) {
        System.out.println(something);
    }
}
