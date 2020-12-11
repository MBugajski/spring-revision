package com.MBugajski.testing.shape;

public class Triangle implements Shape{
    private Double height;
    private Double baseLength;

    public Triangle(Double height, Double baseLength) {
        this.height = height;
        this.baseLength = baseLength;
    }

    @Override
    public String getShapeName() {
        return "triangle";
    }

    @Override
    public Double getField() {
        return baseLength/2 * height;
    }
}
