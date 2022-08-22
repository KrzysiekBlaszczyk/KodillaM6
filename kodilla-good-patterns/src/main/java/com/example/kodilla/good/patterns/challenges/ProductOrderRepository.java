package com.example.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderRepository  implements BuyingRepository{
    public boolean createBuy(User user, Product product, LocalDateTime buyItemAt){
        return true;
    }
}
