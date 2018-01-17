package com.axisdesktop.tradeadvisor.impl;

import java.math.BigDecimal;

public class ChartItem {
	private int date; // 1484528400
	private BigDecimal high;// 0.01188498
	private BigDecimal low; // 0.01184934
	private BigDecimal open; // 0.01184934
	private BigDecimal close; // 0.01184935
	private BigDecimal volume; // 3.23035333
	private BigDecimal quoteVolume; // 272.57281486,
	private BigDecimal weightedAverage; // 0.01185134

	public int getDate() {
		return date;
	}

	public void setDate( int date ) {
		this.date = date;
	}

	public BigDecimal getHigh() {
		return high;
	}

	public void setHigh( BigDecimal high ) {
		this.high = high;
	}

	public BigDecimal getLow() {
		return low;
	}

	public void setLow( BigDecimal low ) {
		this.low = low;
	}

	public BigDecimal getOpen() {
		return open;
	}

	public void setOpen( BigDecimal open ) {
		this.open = open;
	}

	public BigDecimal getClose() {
		return close;
	}

	public void setClose( BigDecimal close ) {
		this.close = close;
	}

	public BigDecimal getVolume() {
		return volume;
	}

	public void setVolume( BigDecimal volume ) {
		this.volume = volume;
	}

	public BigDecimal getQuoteVolume() {
		return quoteVolume;
	}

	public void setQuoteVolume( BigDecimal quoteVolume ) {
		this.quoteVolume = quoteVolume;
	}

	public BigDecimal getWeightedAverage() {
		return weightedAverage;
	}

	public void setWeightedAverage( BigDecimal weightedAverage ) {
		this.weightedAverage = weightedAverage;
	}

	@Override
	public String toString() {
		return "ChartItem [date=" + date + ", high=" + high + ", low=" + low + ", open=" + open + ", close=" + close
				+ ", volume=" + volume + ", quoteVolume=" + quoteVolume + ", weightedAverage=" + weightedAverage + "]";
	}

}
