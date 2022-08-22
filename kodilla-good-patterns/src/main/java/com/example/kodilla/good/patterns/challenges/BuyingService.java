package com.example.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface BuyingService {
    boolean buy(User user, Product product, LocalDateTime itemBuyAt);
}
