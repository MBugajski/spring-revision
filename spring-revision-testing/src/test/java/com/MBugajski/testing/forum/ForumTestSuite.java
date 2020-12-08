package com.MBugajski.testing.forum;

import com.MBugajski.testing.user.SimpleUser;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ForumTestSuite {
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
    public void TestCaseUsername(){
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Doe");
        //When
        String result = simpleUser.getUsername();
        System.out.println("Testing "+ result);
        //Then
        Assert.assertEquals("theForumUser", result);
    }
    @Test
    public void TestCaseRealName(){
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Doe");
        //When
        String result = simpleUser.getRealName();
        System.out.println("Testing "+ result);
        //Then
        Assert.assertEquals("John Doe", result);
    }
}
