package com.example.FxTradingSystem;

import java.util.List;

public class FxUpdateMarketPricesService {

    public List<Price> FxUpdateMarketPricesService(){
    CSVReader newReader = new CSVReader();
    List prices = newReader.CSVReader();
    System.out.println(newReader.CSVReader());
    FxTradingSystemCommissionService createMarketPrice = new FxTradingSystemCommissionService();
    createMarketPrice.addCommissionBid(prices);
    createMarketPrice.addCommissionAsk(prices);
    System.out.println(prices);
        return prices;
    }


}
