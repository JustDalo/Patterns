package com.dalo.patterns.behavioralPatterns.state.state;

import com.dalo.patterns.behavioralPatterns.state.model.Package;

public interface PackageState {
    void next(Package pkg);
    void prev(Package pkg);
    void printState();
}
