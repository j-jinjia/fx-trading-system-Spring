package com.example.FxTradingSystem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FxTradingSystemController {

    FxUpdateMarketPricesService newMarketPrices = new FxUpdateMarketPricesService();


    @GetMapping("/getUpdatedMessage")
    public List<Price> getUpdatedPrices(){
        return newMarketPrices.FxUpdateMarketPricesService();
    }



}
