package com.dalo.patterns.behavioralPatterns.state.state.impl;

import com.dalo.patterns.behavioralPatterns.state.model.Package;
import com.dalo.patterns.behavioralPatterns.state.state.PackageState;

public class OrderedState implements PackageState {
    @Override
    public void next(Package pkg) {
        pkg.setPackageState(new DeliveredState());
    }

    @Override
    public void prev(Package pkg) {

    }

    @Override
    public void printState() {

    }
}
