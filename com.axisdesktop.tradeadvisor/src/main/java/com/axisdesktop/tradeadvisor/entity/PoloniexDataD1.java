package com.axisdesktop.tradeadvisor.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table( name = "poloniex_data_d1" )
public class PoloniexDataD1 extends PoloniexData {

	@Override
	public String toString() {
		return "PoloniexDataD1 " + super.toString();
	}

}
