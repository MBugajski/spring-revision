package com.MBugajski.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticianTestSuite {

    @Test
    public void testZeroPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(10);

        Statistician statistician = new Statistician();
        statistician.calculateAdvStatistics(statisticsMock);

        //When
        double commentsPerPost = statistician.commentsPerPost;

        //Then
        Assert.assertEquals(-1, commentsPerPost, 0.0001);
    }

    @Test
    public void testThousandPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            users.add(String.valueOf(i));
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(1000);

        Statistician statistician = new Statistician();
        statistician.calculateAdvStatistics(statisticsMock);

        //When
        double postsPerUser = statistician.postsPerUser;

        //Then
        Assert.assertEquals(100, postsPerUser, 0.0001);
    }

    @Test
    public void testZeroComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            users.add(String.valueOf(i));
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(0);

        Statistician statistician = new Statistician();
        statistician.calculateAdvStatistics(statisticsMock);

        //When
        double commentsPerUser = statistician.commentsPerUser;

        //Then
        Assert.assertEquals(0, commentsPerUser, 0.0001);
    }


    @Test
    public void testMorePosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(50);
    }
}