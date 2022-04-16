package com.dalo.patterns.behavioralPatterns.state.model;

import com.dalo.patterns.behavioralPatterns.state.state.PackageState;
import com.dalo.patterns.behavioralPatterns.state.state.impl.OrderedState;

public class Package {
    private PackageState packageState;

    public Package() {
        packageState = new OrderedState();
    }
    public void previousState() {
        packageState.prev(this);
    }
    public void nextState() {
        packageState.next(this);
    }

    public void printStatus() {
        packageState.printState();
    }

    public PackageState getPackageState() {
        return packageState;
    }

    public void setPackageState(PackageState packageState) {
        this.packageState = packageState;
    }
}
