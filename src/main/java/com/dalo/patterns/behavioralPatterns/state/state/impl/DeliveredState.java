package com.dalo.patterns.behavioralPatterns.state.state.impl;

import com.dalo.patterns.behavioralPatterns.state.model.Package;
import com.dalo.patterns.behavioralPatterns.state.state.PackageState;

public class DeliveredState implements PackageState {
    @Override
    public void next(Package pkg) {
        pkg.setPackageState(new ReceivedState());
    }

    @Override
    public void prev(Package pkg) {
        pkg.setPackageState(new OrderedState());
    }

    @Override
    public void printState() {

    }
}
