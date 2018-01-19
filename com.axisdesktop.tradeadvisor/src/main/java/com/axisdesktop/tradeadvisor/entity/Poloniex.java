package com.axisdesktop.tradeadvisor.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table( name = "poloniex" )
public class Poloniex extends Stock {

	@Override
	public String toString() {
		return "Poloniex" + super.toString();
	}

}
