package com.axisdesktop.tradeadvisor.impl;

import java.io.IOException;

import org.knowm.xchange.Exchange;
import org.knowm.xchange.ExchangeFactory;
import org.knowm.xchange.ExchangeSpecification;
import org.knowm.xchange.dto.account.AccountInfo;
import org.knowm.xchange.exceptions.ExchangeException;
import org.knowm.xchange.exceptions.NotAvailableFromExchangeException;
import org.knowm.xchange.exceptions.NotYetImplementedForExchangeException;
import org.knowm.xchange.poloniex.PoloniexExchange;
import org.knowm.xchange.service.account.AccountService;

public class PoloniexApp {

	public static void main( String[] args ) throws NotAvailableFromExchangeException,
			NotYetImplementedForExchangeException, ExchangeException, IOException {
		if( args.length != 2 ) throw new IllegalArgumentException( "Usage: PoloniexApp key secret" );
		// TODO Auto-generated method stub
		System.out.println( args[0] );
		System.out.println( args[1] );

		ExchangeSpecification exSpec = new PoloniexExchange().getDefaultExchangeSpecification();
		// exSpec.setUserName( "barabass@gmail.com" );
		exSpec.setApiKey( args[0] );
		exSpec.setSecretKey( args[1] );
		Exchange bitstamp = ExchangeFactory.INSTANCE.createExchange( exSpec );

		// Get the account information
		AccountService accountService = bitstamp.getAccountService();
		AccountInfo accountInfo = accountService.getAccountInfo();
		System.out.println( accountInfo.toString() );

		// Exchange bitstamp = ExchangeFactory.INSTANCE.createExchange( PoloniexExchange.class.getName() );
		//
		// MarketDataService marketDataService = bitstamp.getMarketDataService();
		//
		// Ticker ticker = marketDataService.getTicker( CurrencyPair.BTC_USD );
		//
		// System.out.println( ticker.toString() );

		//
		// StreamingExchange exchange = StreamingExchangeFactory.INSTANCE
		// .createExchange( PoloniexStreamingExchange.class.getName() );
		//
		// // Connect to the Exchange WebSocket API. Blocking wait for the connection.
		// exchange.connect().blockingAwait();
		//
		// // Subscribe to live trades update.
		// exchange.getStreamingMarketDataService().getTrades( CurrencyPair.BTC_USD ).subscribe( trade -> {
		// // LOG.info( "Incoming trade: {}", trade );
		// System.out.println( "Incoming trade: {}" + trade );
		// }, throwable -> {
		// System.out.println( "Error in subscribing trades." + throwable );
		// // LOG.error( "Error in subscribing trades.", throwable );
		// } );
		//
		// // Subscribe order book data with the reference to the subscription.
		// Disposable subscription = exchange.getStreamingMarketDataService().getOrderBook( CurrencyPair.BTC_USD )
		// .subscribe( orderBook -> {
		// System.out.println( "tttrade: {}" + orderBook );
		// } );
		//
		// // Unsubscribe from data order book.
		// subscription.dispose();
		//
		// // Disconnect from exchange (non-blocking)
		// exchange.disconnect().subscribe( () -> System.out.println( "Disconnected from the Exchange" ) );

	}

}
