package com.axisdesktop.tradeadvisor.impl;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import org.h2.tools.Server;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.axisdesktop.tradeadvisor.entity.PoloniexDataD1;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class Json2DbApp {

	public static void main( String[] args ) throws ClassNotFoundException, SQLException, IOException {
		Properties props = new Properties();
		URL url = ClassLoader.getSystemResource( "application.properties" );
		props.load( url.openStream() );

		SessionFactory factory = new Configuration() //
				// .setProperty( "hibernate.connection.driver_class", "org.postgresql.Driver" ) //
				// .setProperty( "hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect" ) //
				.setProperty( "hibernate.connection.url", props.getProperty( "spring.datasource.url" ) ) //
				.setProperty( "hibernate.connection.username", props.getProperty( "spring.datasource.username" ) ) //
				.setProperty( "hibernate.connection.password", props.getProperty( "spring.datasource.password" ) ) //
				.addAnnotatedClass( PoloniexDataD1.class )//
				// .setProperty( "hibernate.default_schema", props.getProperty( "db.schema" ) ) //
				.buildSessionFactory();

		// Session sess = factory.openSession();

		Session sess = factory.openSession();
		Transaction tx = null;
		try( Reader reader = new InputStreamReader(
				ClassLoader.getSystemResourceAsStream( "poloniex_btc_dash_d1.json" ), "UTF-8" ) ) {

			Gson gson = new GsonBuilder().create();

			Type collectionType = new TypeToken<List<PoloniexDataD1>>() {
			}.getType();
			List<PoloniexDataD1> enums = gson.fromJson( reader, collectionType );

			tx = sess.beginTransaction();

			// PoloniexDataD1 d = new PoloniexDataD1();
			// d.setDate( 150000000 );
			// sess.save( d );

			for( PoloniexDataD1 d : enums ) {
				// System.out.println( d );

				sess.update( d );
			}

			tx.commit();
		}

		catch( RuntimeException e ) {
			if( tx != null ) tx.rollback();
			throw e;
		}

		finally {
			sess.close();
			factory.close();
		}

		Server server = Server.createWebServer( "-web" ).start();

		// prop.load( new FileInputStream( "application.propertiess" ) );

		// prop.list( System.out );

		// props.list( System.out );

		// Class.forName( "org.h2.Driver" );
		// Connection conn = DriverManager.getConnection( "jdbc:h2:~/tradeadvisor.h2db/tradeadvisor", "admin", "123" );
		// // add application code here
		// conn.close();
		//
		// Server server = Server.createWebServer( "-web" ).start();

		// Transaction tx = factory

	}

}
