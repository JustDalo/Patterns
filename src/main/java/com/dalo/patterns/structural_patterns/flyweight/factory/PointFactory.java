package com.dalo.patterns.structural_patterns.flyweight.factory;



import com.dalo.patterns.structural_patterns.flyweight.model.Point;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class PointFactory {
    static Map<Color, Point> pointsType = new HashMap<>();

    public static Point getPointsType(Color color) {
        Point result = pointsType.get(color);
        if (result == null) {
            result = new Point(color);
            pointsType.put(color, result);
        }
        return result;
    }
}
