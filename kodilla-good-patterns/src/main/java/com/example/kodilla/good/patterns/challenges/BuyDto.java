package com.example.kodilla.good.patterns.challenges;

public class BuyDto {
    private Product product;
    private boolean isBuy;
    private User user;

    public BuyDto(Product product, boolean isBuy, User user) {
        this.product = product;
        this.isBuy = isBuy;
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isBuy() {
        return isBuy;
    }

    public User getUser() {
        return user;
    }
}
