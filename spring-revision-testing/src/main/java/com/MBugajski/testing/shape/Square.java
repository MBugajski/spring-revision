package com.MBugajski.testing.shape;

public class Square implements Shape {
    private Double sideLength;

    public Square(Double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public String getShapeName() {
        return "square";
    }

    @Override
    public Double getField() {
        return sideLength * sideLength;
    }
}
