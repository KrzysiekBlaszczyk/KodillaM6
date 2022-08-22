package com.example.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderService implements BuyingService {
    public boolean buy(final User user, final Product product, final LocalDateTime itemBuyAt) {
        System.out.println("User: "+user.getFirstName()+user.getLastName()+" buy: "+product +"at: "+itemBuyAt);
        return true;
    }
}
