package com.axisdesktop.tradeadvisor.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerH {
	@RequestMapping( "/" )
	public String home() {
		return "Hello World!";
	}

	@RequestMapping( "/poloniex" )
	public String poloniex2() {
		return "poloniex";
	}
}
