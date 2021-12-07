package com.jmr.unal.swiftmessage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableScheduling
@SpringBootApplication
public class CurrencyChangeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyChangeApplication.class, args);
	}

	
}
