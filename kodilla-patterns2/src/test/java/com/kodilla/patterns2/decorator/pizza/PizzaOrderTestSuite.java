package com.kodilla.patterns2.decorator.pizza;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //when
        BigDecimal calculatedCost = theOrder.getCost();
        //then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //when
        String description = theOrder.getDescription();
        //then
        assertEquals("You order pizza", description);
    }

    @Test
    public void testPizzaWithExtraCheeseOrderGetCost() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        //when
        BigDecimal calculatedCost = theOrder.getCost();
        //then
        assertEquals(new BigDecimal(17), calculatedCost);
    }

    @Test
    public void testPizzaWithExtraCheeseOrderGetDescription() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        //when
        String description = theOrder.getDescription();
        //then
        assertEquals("You order pizza + extra cheese", description);
    }

    @Test
    public void testPizzaWithExtraCheeseAndDeliveryOrderGetCost() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new AdditionalDeliveryDecorator(theOrder);
        //when
        BigDecimal calculatedCost = theOrder.getCost();
        //then
        assertEquals(new BigDecimal(24), calculatedCost);
    }

    @Test
    public void testPizzaWithExtraCheeseAndDeliveryOrderGetDescription() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new AdditionalDeliveryDecorator(theOrder);
        //when
        String description = theOrder.getDescription();
        //then
        assertEquals("You order pizza + extra cheese + delivery", description);
    }

    @Test
    public void testPizzaWithAdditionalHamAndPepperOrderGetCost() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new AdditionalHamDecorator(theOrder);
        theOrder = new AdditionalPepperDecorator(theOrder);
        //when
        BigDecimal calculatedCost = theOrder.getCost();
        //then
        assertEquals(new BigDecimal(18), calculatedCost);
    }

    @Test
    public void testPizzaWithAdditionalHamAndPepperOrderDescription() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new AdditionalHamDecorator(theOrder);
        theOrder = new AdditionalPepperDecorator(theOrder);
        //when
        String description = theOrder.getDescription();
        //then
        assertEquals("You order pizza + ham + pepper", description);
    }

    @Test
    public void testPizzaWithAdditionalHamAndTomatoOrderGetCost() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new AdditionalHamDecorator(theOrder);
        theOrder = new AdditionalTomatoDecorator(theOrder);
        //when
        BigDecimal calculatedCost = theOrder.getCost();
        //then
        assertEquals(new BigDecimal(20), calculatedCost);
    }

    @Test
    public void testPizzaWithAdditionalHamAndTomatoOrderGetDescription() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new AdditionalHamDecorator(theOrder);
        theOrder = new AdditionalTomatoDecorator(theOrder);
        //when
        String description = theOrder.getDescription();
        //then
        assertEquals("You order pizza + ham + tomato", description);
    }

    @Test
    public void testPizzaOrderWithAllOptionsGetCost() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new AdditionalHamDecorator(theOrder);
        theOrder = new AdditionalTomatoDecorator(theOrder);
        theOrder = new AdditionalPepperDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new AdditionalDeliveryDecorator(theOrder);
        //when
        BigDecimal calculatedCost = theOrder.getCost();
        //then
        assertEquals(new BigDecimal(30), calculatedCost);
    }

    @Test
    public void testPizzaOrderWithAllOptionsGetDescription() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new AdditionalHamDecorator(theOrder);
        theOrder = new AdditionalTomatoDecorator(theOrder);
        theOrder = new AdditionalPepperDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new AdditionalDeliveryDecorator(theOrder);
        //when
        String description = theOrder.getDescription();
        //then
        assertEquals("You order pizza + ham + tomato + pepper + extra cheese + delivery", description);
    }
}
