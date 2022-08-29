package com.kodilla.patterns.strategy.social;


import com.kodilla.patterns.strategy.social.socials.FacebookPublisher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies() {
        //Given
        User krzysiek = new ZGeneration("Krzysiek");
        User jan = new Millenials("Jan");
        User tomek = new YGeneration("Tomek");

        //When
        String krzysiekShare = krzysiek.sharePost();
        System.out.println("Krzysiek share post on: " + krzysiekShare);
        String janShare = jan.sharePost();
        System.out.println("Jan share post on: " + janShare);
        String tomekShare = tomek.sharePost();
        System.out.println("Tomek share post on: " + tomekShare);

        //Then
        assertEquals("Snapchat", krzysiekShare);
        assertEquals("Facebook", janShare);
        assertEquals("Twitter", tomekShare);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User krzysiek = new ZGeneration("Krzysiek");

        //When
        String krzysiekShare = krzysiek.sharePost();
        System.out.println("Krzysiek share post on: " + krzysiekShare);
        krzysiek.setSocialPublisher(new FacebookPublisher());
        krzysiekShare = krzysiek.sharePost();
        System.out.println("Krzysiek share post on: " + krzysiekShare);

        //Then
        assertEquals("Facebook", krzysiekShare);
    }
}
