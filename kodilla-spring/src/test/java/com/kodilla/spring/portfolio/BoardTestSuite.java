package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd(){
        //Given
        ApplicationContext context= new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().getTasks().add("testToDo");
        board.getInProgressList().getTasks().add("testInProgress");
        board.getDoneList().getTasks().add("testDoneList");
        //Then
        System.out.println("To do test: "+board.getToDoList().getTasks().get(0));
        System.out.println("In progress test: "+board.getInProgressList().getTasks().get(0));
        System.out.println("Done list test: "+board.getDoneList().getTasks().get(0));
    }
}
