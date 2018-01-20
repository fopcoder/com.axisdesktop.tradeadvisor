package com.axisdesktop.tradeadvisor.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "stock" )
public class Stock {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private int id;

	private String name;

	@Column( name = "taker_fee", precision = 8, scale = 6 )
	private BigDecimal takerFee;

	@Column( name = "maker_fee", precision = 8, scale = 6 )
	private BigDecimal makerFee;

	public String getName() {
		return name;
	}

	public void setName( String name ) {
		this.name = name;
	}

	public BigDecimal getTakerFee() {
		return takerFee;
	}

	public void setTakerFee( BigDecimal takerFee ) {
		this.takerFee = takerFee;
	}

	public BigDecimal getMakerFee() {
		return makerFee;
	}

	public void setMakerFee( BigDecimal makerFee ) {
		this.makerFee = makerFee;
	}

	@Override
	public String toString() {
		return " [name=" + name + ", takerFee=" + takerFee + ", makerFee=" + makerFee + "]";
	}

}
