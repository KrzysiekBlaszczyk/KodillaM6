package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ArrayoperationsTestSuite {
    @Test
    void testGetAverage(){
        //Given
        int numbers[]={1,2,3,4,5,6,7,8,9};
        //When
        double result = ArrayOperations.getAvarage(numbers);
        //Then
        assertEquals(5,result);
    }

    @Test
    void testGetAverageOnEmptyList(){
        //Given
        int numbers[]= {};
        //When
        double result = ArrayOperations.getAvarage(numbers);
        //Then
        assertEquals(Double.NaN, result);

    }
}
