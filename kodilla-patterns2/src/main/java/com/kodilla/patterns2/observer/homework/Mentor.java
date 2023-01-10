package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.ForumTopic;

public class Mentor implements HomeworkObserver{
    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(HomeworkToDo homework) {
        System.out.println(username + ": New messages in topic " + homework.getName() + "\n" +
                " (total: " + homework.getMessages().size() + " messages)");
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
