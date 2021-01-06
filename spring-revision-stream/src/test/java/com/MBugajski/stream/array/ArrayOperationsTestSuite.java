package com.MBugajski.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int[] numbers = {1, 2, 3, 4, 6, 11, 55};

        //When
        double average = ArrayOperation.getAverage(numbers);

        //Then
        Assert.assertEquals(11.71, average, 0.01);
    }
}
