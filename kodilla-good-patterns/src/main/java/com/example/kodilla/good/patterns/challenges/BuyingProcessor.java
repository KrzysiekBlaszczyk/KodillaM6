package com.example.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class BuyingProcessor {
    private InformationService informationService;
    private BuyingService buyingService;
    private BuyingRepository buyingRepository;

    public BuyingProcessor(final InformationService informationService, final BuyingService buyingService, final BuyingRepository buyingRepository) {
        this.informationService = informationService;
        this.buyingService = buyingService;
        this.buyingRepository = buyingRepository;
    }

    public BuyDto process(final OrderRequest orderRequest){
        boolean isBuy = buyingService.buy(orderRequest.getUser(),orderRequest.getProduct(),orderRequest.getBuyItemAt());
        if(isBuy){
            informationService.inform(orderRequest.getUser());
            buyingRepository.createBuy(orderRequest.getUser(),orderRequest.getProduct(),orderRequest.getBuyItemAt());
            return new BuyDto(orderRequest.getProduct(),true,orderRequest.getUser());
        } else{
            return new BuyDto(orderRequest.getProduct(),false,orderRequest.getUser());
        }
    }
}
