package com.mbugajski.spring.core.forum;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ForumUserTestSuite {
    @Test
    public void testGetUsername() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.mbugajski.spring.core.forum");
        ForumUser forumUser = context.getBean(ForumUser.class);
        //When
        String name = forumUser.getUsername();
        //Then
        Assert.assertEquals("John Smith", name);
    }


}
