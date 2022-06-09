package com.example.FxTradingSystem;

import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FxTradingSystemController {

    FxUpdateMarketPricesService newMarketPrices = new FxUpdateMarketPricesService();


    @GetMapping("/getUpdatedMessage")
    public ResponseEntity<List<Price>> getUpdatedPrices(){
        try{

        return ResponseEntity.status(HttpStatus.OK).body(newMarketPrices.FxUpdateMarketPricesService());
        }catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



}
