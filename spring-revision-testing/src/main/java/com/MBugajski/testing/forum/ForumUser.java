package com.MBugajski.testing.forum;

import java.util.ArrayList;
import java.util.LinkedList;

public class ForumUser {
    private String name;
    private String realName;
    private ArrayList<ForumPost> posts = new ArrayList<>();
    private LinkedList<ForumComment> comments = new LinkedList<>();

    public ForumUser(String name, String realName) {
        this.name = name;
        this.realName = realName;
    }

    public void addPost(String author, String postBody){
        //do nothing
    }

    public void addComment (ForumPost thePost, String author, String commentBody){
        //do nothing
    }

    public int getPostsQuantity(){
        //temp return
        return 100;
    }

    public int getCommentsQuantity(){
        //temp return
        return 100;
    }

    public ForumPost getPost (int postNumber){
        //returning null means operation was unsuccessful
        return null;
    }
    public ForumComment getComment (int commentNumber){
        //returning null means operation was unsuccessful
        return null;
    }

    public boolean removePost (ForumPost thePost){
        //temp return
        return true;
    }

    public boolean removeComment (ForumComment theComment){
        //temp return
        return true;
    }

    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }
}
