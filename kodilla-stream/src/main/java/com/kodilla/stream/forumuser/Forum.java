package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    final List<ForumUser> userList = new ArrayList<>();

    public Forum(){
        userList.add(new ForumUser(1,"Krzysiek",'M', 2001,12,23,1));
        userList.add(new ForumUser(2,"Marta",'F', 2003,12,23,2));
        userList.add(new ForumUser(3,"Kasia",'F', 2012,12,23,3));
        userList.add(new ForumUser(4,"Paweł",'M', 2020,12,23,0));
        userList.add(new ForumUser(5,"Ola",'F', 2009,12,23,0));
        userList.add(new ForumUser(6,"Marcin",'M', 2000,12,23,3));
        userList.add(new ForumUser(7,"Mateusz",'M', 2012,12,23,18));
        userList.add(new ForumUser(8,"Iwona",'F', 2002,12,23,0));
        userList.add(new ForumUser(9,"Krzysiek",'M', 2010,12,23,1));
    }
    public List<ForumUser> getUserList() {
        return userList;
    }
}
