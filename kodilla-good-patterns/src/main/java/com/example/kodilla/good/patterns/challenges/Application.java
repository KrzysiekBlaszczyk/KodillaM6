package com.example.kodilla.good.patterns.challenges;

public class Application {
    public static void main(String[] args) {
    OrderRequestRetrieve orderRequestRetrieve = new OrderRequestRetrieve();
    OrderRequest orderRequest = orderRequestRetrieve.retrieve();
    BuyingProcessor buyingProcessor = new BuyingProcessor(new MailService(), new ProductOrderService(), new ProductOrderRepository());
    buyingProcessor.process(orderRequest);
    }
}
