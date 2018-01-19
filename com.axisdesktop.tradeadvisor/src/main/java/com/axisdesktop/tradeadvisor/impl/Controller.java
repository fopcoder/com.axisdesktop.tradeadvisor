package com.axisdesktop.tradeadvisor.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@RequestMapping( "/" )
	public String home() {
		return "Hello World!";
	}

	@RequestMapping( "/poloniex" )
	public String poloniex() {
		return "Hello Polo!";
	}
}
