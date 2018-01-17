package com.axisdesktop.tradeadvisor.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "poloniex_data_d1" )
public class PoloniexDataD1 {
	@Id
	private int date;

	@Column( precision=8, scale=8 )
	private BigDecimal high;
	
	@Column( precision=8, scale=8 )
	private BigDecimal low;
	
	@Column( precision=8, scale=8 )
	private BigDecimal open;
	
	@Column( precision=8, scale=8 )
	private BigDecimal close;
	
	@Column( precision=8, scale=8 )
	private BigDecimal volume;

	@Column( name = "quote_volume", precision=8, scale=8 )
	private BigDecimal quoteVolume;

	@Column( name = "weighted_average", precision=8, scale=8 )
	private BigDecimal weighted_average;

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

	public BigDecimal getWeighted_average() {
		return weighted_average;
	}

	public void setWeighted_average( BigDecimal weighted_average ) {
		this.weighted_average = weighted_average;
	}

	@Override
	public String toString() {
		return "PoloniexDataD1 [date=" + date + ", high=" + high + ", low=" + low + ", open=" + open + ", close="
				+ close + ", volume=" + volume + ", quoteVolume=" + quoteVolume + ", weighted_average="
				+ weighted_average + "]";
	}

}
