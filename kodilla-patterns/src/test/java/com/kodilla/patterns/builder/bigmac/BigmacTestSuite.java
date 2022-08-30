package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {
    @Test
    void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigMacBuilder()
                .bun("Standard")
                .ingredient(Ingredient.BEACON)
                .sauce("1000 wysp")
                .ingredient(Ingredient.CHEESE)
                .ingredient(Ingredient.MUSHROOM)
                .burgers(3)
                .build();
        System.out.println(bigmac);

        //When
        String bun = bigmac.getBun();
        String sauce = bigmac.getSauce();
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();

        //Then
        assertEquals("Standard", bun);
        assertEquals("1000 wysp", sauce);
        assertEquals(3, howManyIngredients);
        assertEquals(3, howManyBurgers);
    }
}
