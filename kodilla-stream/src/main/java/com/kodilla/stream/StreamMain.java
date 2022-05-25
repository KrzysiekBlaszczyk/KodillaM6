package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;


public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10,5,(a,b)-> a+b);
        expressionExecutor.executeExpression(10,5,(a,b)-> a-b);
        expressionExecutor.executeExpression(10,5,(a,b)-> a*b);
        expressionExecutor.executeExpression(10,5,(a,b)-> a/b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println("Make string beautifier");
        poemBeautifier.decorate("test", test -> test.toUpperCase());
        poemBeautifier.decorate("test", test -> test+"abc");
        poemBeautifier.decorate("test", test -> "'"+test+"'");
        poemBeautifier.decorate("test", test -> test+"****");
    }
}
