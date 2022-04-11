package com.dalo.patterns.behavioralPatterns.observer.service;

import com.dalo.patterns.behavioralPatterns.observer.event.EventListener;

import java.util.ArrayList;
import java.util.List;

public class Service {
    private List<EventListener> observers = new ArrayList<>();
    public void addObserver(EventListener eventListener) {
        observers.add(eventListener);
    }
    public void removeObserver(EventListener eventListener) {
        observers.remove(eventListener);
    }
    public void updateObserver(String something) {
        for (EventListener eventListener : this.observers) {
            eventListener.update(something);
        }
    }


}
