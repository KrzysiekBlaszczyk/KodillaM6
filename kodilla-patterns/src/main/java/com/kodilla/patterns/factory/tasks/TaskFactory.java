package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task createTask(final String taskClass){
        switch(taskClass){
            case DRIVING:
                return new DrivingTask("Driving task","Warszawa","Car");
            case PAINTING:
                return new PaintingTask("Painting task","blue","wall");
            case SHOPPING:
                return new ShoppingTask("Shopping task", "Milk",2);
            default:
                return null;
        }
    }
}
