package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int id;
    private final String userName;
    private final char Sex;
    private final LocalDate date;
    private final int amountOfPosts;

    public ForumUser(int id, String userName, char sex, int year, int month, int day, int amountOfPosts) {
        this.id = id;
        this.userName = userName;
        Sex = sex;
        this.date = LocalDate.of(year,month,day);
        this.amountOfPosts = amountOfPosts;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return Sex;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getAmountOfPosts() {
        return amountOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", Sex=" + Sex +
                ", date=" + date +
                ", amountOfPosts=" + amountOfPosts +
                '}';
    }
}
