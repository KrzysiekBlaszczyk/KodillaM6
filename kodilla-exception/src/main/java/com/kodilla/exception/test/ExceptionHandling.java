package com.kodilla.exception.test;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        String result = "No result";
        try {
            secondChallenge.probablyIWillThrowException(1.5,1);
        } catch (Exception e) {
            System.out.println("Exception "+e);
        } finally {
            System.out.println(result);
        }
    }
}