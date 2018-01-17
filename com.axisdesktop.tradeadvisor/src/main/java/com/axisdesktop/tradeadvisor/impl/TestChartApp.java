package com.axisdesktop.tradeadvisor.impl;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.net.URISyntaxException;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class TestChartApp {

	public static void main( String[] args ) throws IOException, URISyntaxException {

		try( Reader reader = new InputStreamReader( TestChartApp.class.getResourceAsStream( "/history_data.json" ),
				"UTF-8" ) ) {
			Gson gson = new GsonBuilder().create();

			Type collectionType = new TypeToken<List<ChartItem>>() {
			}.getType();
			List<ChartItem> enums = gson.fromJson( reader, collectionType );

			System.out.println( enums );

		}

		// URL url = TestChartApp.class.getClassLoader().getResource( "history_data.json" );
		//
		// byte[] encoded = Files.readAllBytes( Paths.get( url.toURI() ) );
		// String data = new String( encoded );
		//
		// System.out.println( data.toString() );

	}

}
