package com.mbugajski.spring.core;

import com.mbugajski.spring.core.shape.Circle;
import com.mbugajski.spring.core.shape.Shape;
import com.mbugajski.spring.core.shape.Square;
import com.mbugajski.spring.core.shape.Triangle;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootTest
public class SpringRunnerTestSuite {
    @Test
    public void testCircleLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.mbugajski.spring.core");
        Shape shape = (Shape)context.getBean("circle");
        //When
        String name = shape.getShapeName();
        //Then
        Assert.assertEquals("This is a circle.", name);
    }

    @Test
    public void testTriangleLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.mbugajski.spring.core");
        Shape shape = (Shape)context.getBean("triangle");
        //When
        String name = shape.getShapeName();
        //Then
        Assert.assertEquals("This is a triangle.", name);
    }

    @Test
    public void testSquareLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.mbugajski.spring.core");
        Shape shape = (Shape)context.getBean("createSquare");
        //When
        String name = shape.getShapeName();
        //Then
        Assert.assertEquals("This is a square.", name);
    }

    @Test
    public void testShapeLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.mbugajski.spring.core");
        Shape shape = (Shape)context.getBean("chosenShape");
        //When
        String name = shape.getShapeName();
        //Then
        System.out.println("Chosen shape says: " + name);
    }
}

















