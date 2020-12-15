package com.MBugajski.testing.shape;

import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite {
    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(new Triangle(3.0, 4.0));
        //Then
        Assert.assertEquals(1, shapeCollector.getCollectionSize());
    }
    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(3.0);
        shapeCollector.addFigure(shape);
        //When
        boolean result = shapeCollector.removeFigure(shape);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.getCollectionSize());
    }
    @Test
    public void testRemoveFigureNotExisting(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(3.0);
        //When
        boolean result = shapeCollector.removeFigure(shape);
        //Then
        Assert.assertFalse(result);

    }
    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Circle(3.0);
        //When
        shapeCollector.addFigure(shape);
        //Then
        Assert.assertEquals(shape, shapeCollector.getFigure(0));

    }
}
