package com.dalo.patterns.behavioralPatterns.state.state.impl;

import com.dalo.patterns.behavioralPatterns.state.model.Package;
import com.dalo.patterns.behavioralPatterns.state.state.PackageState;

public class ReceivedState implements PackageState {
    @Override
    public void next(Package pkg) {

    }

    @Override
    public void prev(Package pkg) {
        pkg.setPackageState(new DeliveredState());
    }

    @Override
    public void printState() {

    }
}
