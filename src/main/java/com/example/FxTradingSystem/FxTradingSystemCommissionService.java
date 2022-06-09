package com.example.FxTradingSystem;

import java.util.ArrayList;
import java.util.List;

public class FxTradingSystemCommissionService {
    public List<Price> addCommissionBid(List<Price> prices){
        ArrayList<Price> correctPrices = new ArrayList<>();

        for(Price price:prices){
            if(price.getBid()<price.getAsk()){
                price.setBid((price.getBid()-(0.001*price.getBid())));
                correctPrices.add(price);
            }
        }
        return correctPrices;
//        prices.forEach(price -> price.setBid(price.getBid()-(0.001*price.getBid())));
//        return prices;

    }
    public List<Price> addCommissionAsk(List<Price> prices){
        ArrayList<Price> correctPrices = new ArrayList<>();

        for(Price price:prices){
            if(price.getBid()<price.getAsk()){
                price.setBid((price.getAsk()-(0.001*price.getAsk())));
                correctPrices.add(price);
            }
        }
        return correctPrices;

//        prices.forEach(price -> price.setAsk(price.getAsk()-(0.001*price.getAsk())));
//        return prices;
    }
}