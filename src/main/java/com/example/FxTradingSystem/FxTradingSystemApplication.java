package com.example.FxTradingSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.util.List;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@CrossOrigin
public class FxTradingSystemApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(FxTradingSystemApplication.class, args);

	}

}
