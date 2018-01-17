package com.axisdesktop.tradeadvisor.impl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

//@EnableConfigurationProperties
@EntityScan(basePackages = {"com.axisdesktop.tradeadvisor.entity"}) 
@SpringBootApplication
public class PoloniexWebApp {

	public static void main(String[] args) {
		SpringApplication.run(PoloniexWebApp.class, args);
	}

}
