package com.axisdesktop.tradeadvisor.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.h2.tools.Server;

public class TestH2App {

	public static void main( String[] args ) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName( "org.h2.Driver" );
		Connection conn = DriverManager.getConnection( "jdbc:h2:~/tradeadvisor.h2db/tradeadvisor", "root", "123" );
		// add application code here
		conn.close();

		Server server = Server.createWebServer( "-web" ).start();

	}

}
