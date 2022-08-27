package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TaskList {
    private List<String> tasks;
    public TaskList(){
        tasks= new ArrayList<>();
    }

    public List<String> getTasks() {
        return tasks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskList taskList = (TaskList) o;
        return Objects.equals(tasks, taskList.tasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tasks);
    }
}
