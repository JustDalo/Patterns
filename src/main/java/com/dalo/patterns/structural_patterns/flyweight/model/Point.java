package com.dalo.patterns.structural_patterns.flyweight.model;

import java.awt.*;

public class Point {
    private int x;
    private int y;
    private Color color;

    public Point() {
    }

    public Point(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
