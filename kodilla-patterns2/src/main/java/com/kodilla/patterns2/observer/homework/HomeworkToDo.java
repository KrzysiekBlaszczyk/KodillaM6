package com.kodilla.patterns2.observer.homework;


import java.util.ArrayList;
import java.util.List;

public class HomeworkToDo implements HomeworkObservable{
    private final List<String> messages;
    private final List<HomeworkObserver> observers;
    private final String name;

    public HomeworkToDo(String name) {
        observers = new ArrayList<>();
        messages = new ArrayList<>();
        this.name = name;
    }

    public void addTask(String post) {
        messages.add(post);
        notifyObservers();
    }

    @Override
    public void registerObserver(HomeworkObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (HomeworkObserver observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(HomeworkObserver observer) {
        observers.remove(observer);
    }

    public List<String> getMessages() {
        return messages;
    }

    public String getName() {
        return name;
    }
}
