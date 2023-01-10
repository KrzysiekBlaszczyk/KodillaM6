package com.kodilla.patterns2.observer.homework;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkTaskTestSuite {

    @Test
    public void testUpdate() {
        // Given
        HomeworkToDo user1 = new HomeworkToDo("Queue for user1");
        HomeworkToDo user2 = new HomeworkToDo("Queue for user2");
        HomeworkToDo user3 = new HomeworkToDo("Queue for user3");
        Mentor mentor1 = new Mentor("Paweł");
        Mentor mentor2 = new Mentor("Krzysiek");
        user1.registerObserver(mentor1);
        user1.registerObserver(mentor2);
        user2.registerObserver(mentor1);
        user3.registerObserver(mentor2);

        // When
        user1.addTask("Task 23.3");
        user1.addTask("Task 23.4");
        user2.addTask("Task 2");
        user3.addTask("Task 17.2");
        user3.addTask("Task 17.3");
        // Then
        assertEquals(3, mentor1.getUpdateCount());
        assertEquals(4, mentor2.getUpdateCount());
    }
}
