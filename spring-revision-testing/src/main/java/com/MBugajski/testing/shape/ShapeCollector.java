package com.MBugajski.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        if (shapes.contains(shape)) {
            shapes.remove(shape);
            return true;
        } else {
            return false;
        }
    }

    public int getCollectionSize() {
        return shapes.size();
    }

    public Shape getFigure(int i) {
        Shape shape = null;
        if (i >= 0 && i <= shapes.size()) {
            shape = shapes.get(i);
        };
        return shape;
    }
}
