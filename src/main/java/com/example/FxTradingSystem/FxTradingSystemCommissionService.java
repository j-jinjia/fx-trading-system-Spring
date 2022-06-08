package com.example.FxTradingSystem;

import java.util.List;

public class FxTradingSystemCommissionService {
    public Object addCommissionBid(List<Price> prices){
        prices.forEach(price -> price.setBid(price.getBid()-(0.001*price.getBid())));
        return null;
    }
    public void addCommissionAsk(List<Price> prices){
        prices.forEach(price -> price.setAsk(price.getAsk()-(0.001*price.getAsk())));

    }
}