package com.example.FxTradingSystem;

import com.opencsv.CSVReader;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;

import static org.junit.Assert.*;

public class CSVReaderTest {

    @Test
    public void CSVReader() throws FileNotFoundException {
        CSVReader reader = new CSVReader((new FileReader("prices.csv")));
        assertNotNull(reader);
    }


}