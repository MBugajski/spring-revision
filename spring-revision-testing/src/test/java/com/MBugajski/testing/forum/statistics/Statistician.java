package com.MBugajski.testing.forum.statistics;

public class Statistician {
    int userCount;
    int postCount;
    int commentCount;
    double postsPerUser;
    double commentsPerUser;
    double commentsPerPost;


    public void calculateAdvStatistics(Statistics statistics) {
        userCount = statistics.usersNames().size();
        postCount = statistics.postsCount();
        commentCount = statistics.commentsCount();
        if (userCount != 0) {
            postsPerUser = (double) postCount / userCount;
        } else {
            postsPerUser = -1;
        }
        if (userCount != 0) {
            commentsPerUser = (double) commentCount / userCount;
        } else {
            commentsPerUser = -1;
        }
        if (postCount != 0) {
            commentsPerPost = (double) commentCount / postCount;
        } else {
            commentsPerPost = -1;
        }
    }
}