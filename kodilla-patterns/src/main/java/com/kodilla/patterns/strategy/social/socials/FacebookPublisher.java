package com.kodilla.patterns.strategy.social.socials;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class FacebookPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "Facebook";
    }
}
