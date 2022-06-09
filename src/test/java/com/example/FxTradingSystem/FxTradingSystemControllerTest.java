package com.example.FxTradingSystem;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(MockitoJUnitRunner.class)
@WebMvcTest(FxTradingSystemController.class)
class FxTradingSystemControllerTest {
//test if the prices are returned from the endpoint
    @Autowired
    FxTradingSystemController testController;
    @InjectMocks
    private FxTradingSystemController controller;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(this.controller).build();
    }
    @Test
    void getUpdatedPrices() throws Exception {
        MvcResult mvcResult = mockMvc
                .perform(MockMvcRequestBuilders.get("/getUpdatedMessage"))
                .andExpect(MockMvcResultMatchers.status().isOk()).andReturn();

        assertEquals("response does not match", mvcResult.getResponse().getContentAsString(),
                "some expected response");
    }
//    @Autowired
//    MockMvc mockMvc;
//    @Autowired
//    ObjectMapper mapper;
//    @MockBean
//    ArrayList<Price> prices = new ArrayList<>();
//
//    Price testPrice1 = new Price(106, "EUR/USD", 1.1000,1.2000,"01-06-2020 12:01:01:001");
//    Price testPrice2 = new Price(107, "EUR/JPY", 119.60,119.90,"01-06-2020 12:01:02:002");
//    Price testPrice3 = new Price(108, "GBP/USD", 1.2500,1.2560,"01-06-2020 12:01:02:002");
//
//
//    @BeforeEach
//    void setUp() {
//    }
//
//    @Test
//    void getUpdatedPrices() throws Exception {
//        List<Price> prices = new ArrayList<>(Arrays.asList(testPrice1,testPrice2,testPrice3));
//        Mockito.when(prices).thenReturn(prices);
//        mockMvc.perform(MockMvcRequestBuilders
//                        .get("//getUpdatedMessage")
//                        .contentType(MediaType.APPLICATION_JSON))
//                        .andExpect(status().isOk())
//                        .andExpect(jsonPath("$", hasSize(3)))
//                        .andExpect(jsonPath("$[2].name", is("Jane Doe")));
//    }
}