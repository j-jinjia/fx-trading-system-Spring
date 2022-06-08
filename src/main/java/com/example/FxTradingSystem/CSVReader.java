package com.example.FxTradingSystem;


import com.opencsv.exceptions.CsvException;

import java.io. * ;
import java.util.List;
import java.util.stream.Collectors;

public class CSVReader {

    public List<Price> CSVReader()  {
        try{
        com.opencsv.CSVReader reader = new com.opencsv.CSVReader(new FileReader("prices.csv"));
        List<Price> prices = reader.readAll().stream().map(data-> {
                    Price price = new Price();
                    price.setId(Integer.parseInt(data[0]));
                    price.setInstrumentName(data[1]);
                    price.setBid(Double.parseDouble(data[2]));
                    price.setAsk(Double.parseDouble(data[3]));
                    price.setTimestamp(data[4]);
                    return price;
                }).collect(Collectors.toList());
        //prices.forEach(System.out::println);
        return prices;

        }catch (IOException | CsvException e){
            e.printStackTrace();
        }

        return null;
    }

}
