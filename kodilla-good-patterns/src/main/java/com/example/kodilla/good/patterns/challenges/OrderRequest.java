package com.example.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private LocalDateTime buyItemAt;
    private Product product;

    public OrderRequest(User user, LocalDateTime buyItemAt, Product product) {
        this.user = user;
        this.buyItemAt = buyItemAt;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getBuyItemAt() {
        return buyItemAt;
    }

    public Product getProduct() {
        return product;
    }
}
