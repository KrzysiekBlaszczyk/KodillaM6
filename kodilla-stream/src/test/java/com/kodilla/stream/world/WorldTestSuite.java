package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity() {
        //Given
        World world = new World();
        Continent europa = new Continent("Europa");
        Continent africa = new Continent("Africa");
        Country poland = new Country("Poland",new BigDecimal("10000000"));
        Country france = new Country("France", new BigDecimal("11111110"));
        Country italy = new Country("Italy",new BigDecimal("122323200"));
        Country lagos = new Country("Lagos",new BigDecimal("1020302"));
        Country kair = new Country("Kair",new BigDecimal("230230230"));
        Country luanda = new Country("Luanda",new BigDecimal("100000000"));
        world.addContinent(europa);
        world.addContinent(africa);
        europa.addCountry(poland);
        europa.addCountry(france);
        europa.addCountry(italy);
        africa.addCountry(lagos);
        africa.addCountry(kair);
        africa.addCountry(luanda);
        //When
        BigDecimal countPeople = world.getPeopleQuantity();
        //Then
        BigDecimal countPeopleExpected= new BigDecimal("474684842");
        assertEquals(countPeopleExpected, countPeople);




    }
}
