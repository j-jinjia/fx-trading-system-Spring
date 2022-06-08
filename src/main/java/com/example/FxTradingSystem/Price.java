package com.example.FxTradingSystem;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String instrumentName;
    private double ask;
    private double bid;
    private String timestamp;


    public Price(int id, String instrumentName, double ask, double bid, String timestamp) {
        this.id = id;
        this.instrumentName = instrumentName;
        this.ask = ask;
        this.bid = bid;
        this.timestamp = timestamp;
    }

    public Price() {
        this.id = id;
        this.instrumentName = instrumentName;
        this.ask = ask;
        this.bid = bid;
        this.timestamp = timestamp;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInstrumentName() {
        return instrumentName;
    }

    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    public double getAsk() {
        return ask;
    }

    public void setAsk(double ask) {
        this.ask = ask;
    }

    public double getBid() {
        return bid;
    }

    public void setBid(double bid) {
        this.bid = bid;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "FxTradingSystem{" +
                "id=" + id +
                ", instrumentName='" + instrumentName + '\'' +
                ", ask=" + ask +
                ", bid=" + bid +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}
