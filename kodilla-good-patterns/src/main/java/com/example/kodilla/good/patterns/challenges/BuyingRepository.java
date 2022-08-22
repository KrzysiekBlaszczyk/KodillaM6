package com.example.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface BuyingRepository {
    boolean createBuy(User user, Product product, LocalDateTime itemBuyAt);
}
