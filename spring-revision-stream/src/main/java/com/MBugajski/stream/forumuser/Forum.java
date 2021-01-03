package com.MBugajski.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {
        theUserList.add(new ForumUser(1, "Marco", 'M', LocalDate.of(1970,01,01), 20));
        theUserList.add(new ForumUser(2, "Jane", 'F', LocalDate.of(2001,01,01), 40));
        theUserList.add(new ForumUser(3, "Mary", 'F', LocalDate.of(1995,01,01), 120));
        theUserList.add(new ForumUser(4, "Peter", 'M', LocalDate.of(2000,01,01), 2));
        theUserList.add(new ForumUser(5, "Frank", 'M', LocalDate.of(1968,01,01), 0));
        theUserList.add(new ForumUser(6, "Kate", 'F', LocalDate.of(1974,01,01), 45));
        theUserList.add(new ForumUser(7, "Joe", 'M', LocalDate.of(1987,01,01), 1));
        theUserList.add(new ForumUser(8, "Emma", 'F', LocalDate.of(1992,01,01), 50));

    }
    public List<ForumUser> getUserList() {
        return new ArrayList<>(theUserList);
    }
}
