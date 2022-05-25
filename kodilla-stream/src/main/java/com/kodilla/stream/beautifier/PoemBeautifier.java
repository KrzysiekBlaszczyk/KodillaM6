package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void decorate(String test, PoemDecorator poemDecorator){
        String result = poemDecorator.decorate(test);
        System.out.println(result);
    }
}
