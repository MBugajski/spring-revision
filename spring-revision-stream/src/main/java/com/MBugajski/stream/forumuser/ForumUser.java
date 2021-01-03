package com.MBugajski.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userId;
    private final String username;
    private final char sex;
    private final LocalDate birthday;
    private final int postCount;


    public ForumUser(int userId, String username, char sex, LocalDate birthday, int postCount) {
        this.userId = userId;
        this.username = username;
        this.sex = sex;
        this.birthday = birthday;
        this.postCount = postCount;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getPostCount() {
        return postCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", postCount=" + postCount +
                '}';
    }
}
