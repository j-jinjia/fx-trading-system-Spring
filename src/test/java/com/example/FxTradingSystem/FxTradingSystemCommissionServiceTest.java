package com.example.FxTradingSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FxTradingSystemCommissionServiceTest {
// test that the commissions are applied correctly to bid and ask methods.
    @Autowired
    FxTradingSystemCommissionService commissionService;
    @BeforeEach
    void setUp() {
        List<Price> prices;
        MockitoAnnotations.initMocks(this);


    }


    @Test
    void addCommissionBid() {
        System.out.println("Checking if bid commission is applied correctly");
        Price price = new Price();
        price.setId(106);
        price.setInstrumentName("EUR/USD");
        price.setBid(1.1000);
        price.setAsk(1.2000);
        price.setTimestamp("01-06-2020 12:01:01:001");

        List<Price> prices = new ArrayList<>();
        prices.add(price);


        List result = (List) commissionService.addCommissionBid(prices);
        assertEquals(prices, result);


    }

    @Test
    void addCommissionAsk() {
    }
}