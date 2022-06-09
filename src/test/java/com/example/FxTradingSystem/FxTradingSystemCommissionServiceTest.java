package com.example.FxTradingSystem;

import org.assertj.core.condition.Negative;
import org.junit.Before;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FxTradingSystemCommissionServiceTest {

    FxTradingSystemCommissionService testCommission = new FxTradingSystemCommissionService();
    ArrayList<Price> testPrices = new ArrayList<>();
    ArrayList<Price> testExpectedPricesAsk = new ArrayList<>();
    ArrayList<Price> testExpectedPricesBid = new ArrayList<>();


    @Before
    public void setUp() throws Exception {
        Price testPrice = new Price(106, "EUR/USD", 1.1000,1.2000,"01-06-2020 12:01:01:001");
        testPrices.add(testPrice);
        //positive test cases
        Price expectedPriceAsk = new Price(106, "EUR/USD", 1.1987999999999999,1.2000,"01-06-2020 12:01:01:001");
        testExpectedPricesAsk.add(expectedPriceAsk);
        Price expectedPriceBid = new Price(106, "EUR/USD", 1.1000,1.098,"01-06-2020 12:01:01:001");
        testExpectedPricesBid.add(expectedPriceBid);


    }

    //Positive test cases
    @Test
    public void addCommissionBid() {
        System.out.println("Bid commission applied to bid price by -0.1%");
        List<Price> result = testCommission.addCommissionBid(testPrices);
        assertEquals(testExpectedPricesBid,result);

    }


    @Test
    public void addCommissionAsk() {
        System.out.println("Ask commission applied to bid price by +0.1%");
        List<Price> result = testCommission.addCommissionAsk(testPrices);
        assertEquals(testExpectedPricesAsk,result);
    }

    //Negative test cases



}