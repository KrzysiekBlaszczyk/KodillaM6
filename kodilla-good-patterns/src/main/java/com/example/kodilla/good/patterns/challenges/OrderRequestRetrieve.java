package com.example.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetrieve {
    public OrderRequest retrieve(){
        User user = new User("Krzysiek","Blaszczyk");
        LocalDateTime buyItemAt = LocalDateTime.of(2021,10,1,12,0);
        Product product= new Product("Klapki");
        return new OrderRequest(user,buyItemAt,product);
    }
}
