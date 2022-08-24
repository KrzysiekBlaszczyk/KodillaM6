package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    private Calculator calculator;

    @Test
    public void testCalculations(){
        //Given
        double a = 10;
        double b = 5;

        //When
        double addResult = calculator.add(a,b) ;
        double subResult = calculator.sub(a,b);
        double mulResult = calculator.mul(a,b);
        double divResult = calculator.div(a,b);

        //Then
        assertEquals(15,addResult);
        assertEquals(5,subResult);
        assertEquals(50,mulResult);
        assertEquals(2,divResult);
    }
}
