package com.MBugajski.testing.forum.tdd;

import com.MBugajski.testing.forum.ForumComment;
import com.MBugajski.testing.forum.ForumPost;
import com.MBugajski.testing.forum.ForumUser;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ForumTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of all tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("This is the end of all tests.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test no. " + testCounter);
    }

    @Test
    public void testAddPost() {
        //Given
        ForumUser forumUser = new ForumUser("mrdoe", "John Doe");
        //When
        forumUser.addPost("mrdoe", "Hello everyone, this is my 1st post here.");
        //Then
        Assert.assertEquals(1, forumUser.getPostsQuantity());
    }

    @Test
    public void testAddComment() {
        //Given
        ForumUser forumUser = new ForumUser("mrdoe", "John Doe");
        ForumPost forumPost = new ForumPost("Hello everyone, this is my 1st post here.", "mrdoe");
        //When
        forumUser.addComment(forumPost, "mrdoe", "It's nice to meet you all too.");
        //Then
        Assert.assertEquals(1, forumUser.getCommentsQuantity());
    }

    @Test
    public void testGetPost() {
        //Given
        ForumUser forumUser = new ForumUser("mrdoe", "John Doe");
        ForumPost forumPost = new ForumPost("Hello everyone, this is my 1st post here.", "mrdoe");
        forumUser.addPost(forumPost.getAuthor(), forumPost.getPostBody());
        //When
        ForumPost retrievedPost = forumUser.getPost(0);
        //Then
        Assert.assertEquals(forumPost, retrievedPost);
    }

    @Test
    public void testGetComment() {
        //Given
        ForumUser forumUser = new ForumUser("mrdoe", "John Doe");
        ForumPost forumPost = new ForumPost("Hello everyone, this is my 1st post here.", "mrdoe");
        ForumComment forumComment = new ForumComment(forumPost, "mrdoe", "It's nice to meet you all too.");
        forumUser.addComment(forumPost, forumComment.getAuthor(),
                forumComment.getCommentBody());
        //When
        ForumComment retrievedComment = forumUser.getComment(0);
        //Then
        Assert.assertEquals(forumComment, retrievedComment);
    }

    @Test
    public void testRemovePostNotExisting() {
        //Given
        ForumUser forumUser = new ForumUser("mrdoe", "John Doe");
        ForumPost forumPost = new ForumPost("Hello everyone, this is my 1st post here.", "mrdoe");
        //When
        boolean result = forumUser.removePost(forumPost);
        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemoveCommentNotExisting() {
        //Given
        ForumUser forumUser = new ForumUser("mrdoe", "John Doe");
        ForumPost forumPost = new ForumPost("Hello everyone, this is my 1st post here.", "mrdoe");
        ForumComment forumComment = new ForumComment(forumPost, "mrdoe",
                "It's nice to meet you all too.");
        //When
        boolean result = forumUser.removeComment(forumComment);
        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemovePost() {
        //Given
        ForumUser forumUser = new ForumUser("mrdoe", "John Doe");
        ForumPost forumPost = new ForumPost("Hello everyone, this is my 1st post here.", "mrdoe");
        forumUser.addPost(forumPost.getAuthor(), forumPost.getPostBody());
        //When
        boolean result = forumUser.removePost(forumPost);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getPostsQuantity());
    }

    @Test
    public void testRemoveComment() {
        //Given
        ForumUser forumUser = new ForumUser("mrdoe", "John Doe");
        ForumPost forumPost = new ForumPost("Hello everyone, this is my 1st post here.", "mrdoe");
        ForumComment forumComment = new ForumComment(forumPost, "mrdoe",
                "It's nice to meet you all too.");
        forumUser.addComment(forumPost, forumComment.getAuthor(),
                forumComment.getCommentBody());
        //When
        boolean result = forumUser.removeComment(forumComment);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getCommentsQuantity());
    }
}

