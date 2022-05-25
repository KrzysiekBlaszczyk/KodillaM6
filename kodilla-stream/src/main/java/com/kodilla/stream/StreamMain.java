package com.kodilla.stream;


import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.person.People;
import jdk.swing.interop.SwingInterOpUtils;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> mapOfForumUsers = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex()=='M')
                .filter(forumUser -> Period.between(forumUser.getDate(), LocalDate.now()).getYears()>=20)
                .filter(forumUser -> forumUser.getAmountOfPosts()>0)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));
        mapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey()+": "+ entry.getValue())
                .forEach(System.out::println);
    }

}
