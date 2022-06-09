package com.example.FxTradingSystem;

import java.util.List;

public class FxTradingSystemCommissionService {
    public List<Price> addCommissionBid(List<Price> prices){
        prices.forEach(price -> price.setBid(price.getBid()-(0.001*price.getBid())));
        return prices;

    }
    public List<Price> addCommissionAsk(List<Price> prices){
        prices.forEach(price -> price.setAsk(price.getAsk()-(0.001*price.getAsk())));
        return prices;
    }
}