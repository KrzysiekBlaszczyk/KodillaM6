package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();
        System.out.println("Test - pierwszy test jednostkowy:");
        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        System.out.println("Test - drugi test jednostkowy:");
        Calculator calculator = new Calculator();
        int result2 = calculator.add(4,2);
        int result3 = calculator.substract(4,2);
        if(result2==6){
            System.out.println("test OK");
        }
        else{
            System.out.println("Error!");
        }
        System.out.println("Test - trzeci test jednostkowy:");
        if(result3==2){
            System.out.println("test OK");
        }
        else{
            System.out.println("Error!");
        }

    }
}
