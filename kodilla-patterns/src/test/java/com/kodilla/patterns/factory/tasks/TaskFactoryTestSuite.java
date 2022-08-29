package com.kodilla.patterns.factory.tasks;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public final class TaskFactoryTestSuite {
    @Test
    void testDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task driveTask = factory.createTask(TaskFactory.DRIVING);

        //Then
        assertEquals("Driving task", driveTask.getTaskName());
        assertFalse(driveTask.isTaskExecuted());
    }
    @Test
    void testShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shopTask = factory.createTask(TaskFactory.SHOPPING);
        shopTask.executeTask();
        //Then
        assertEquals("Shopping task", shopTask.getTaskName());
        assertTrue(shopTask.isTaskExecuted());
    }
    @Test
    void testPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task paintTask = factory.createTask(TaskFactory.PAINTING);

        //Then
        assertEquals("Painting task",paintTask.getTaskName());
        assertFalse(paintTask.isTaskExecuted());
    }
}
