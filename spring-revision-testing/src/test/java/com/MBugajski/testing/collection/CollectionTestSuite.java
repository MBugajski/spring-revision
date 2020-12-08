package com.MBugajski.testing.collection;

import com.MBugajski.testing.collections.OddNumberDalek;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionTestSuite {
    OddNumberDalek dalek = new OddNumberDalek();
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Test Suite: end");
    }
    @Test
    public void testOddNumberDalekEmptyList(){
        //Given
        ArrayList<Integer> testList = new ArrayList<>();
        //When
        ArrayList<Integer> result = dalek.exterminate(testList);
        //Then
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void testOddNumberDalekNormalList(){
        //Given
        ArrayList<Integer> testList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> noOddNumbers = new ArrayList<>(Arrays.asList(2, 4));
        //When
        ArrayList<Integer> result = dalek.exterminate(testList);
        //Then
        Assert.assertEquals(noOddNumbers, result);
    }
}
