package com.axisdesktop.tradeadvisor;

import static org.junit.Assert.assertTrue;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TimestampTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		long timestamp = 1391731200 * 1000L;
		// long timestamp = 1516320000 * 1000L;
		Date date = new Date( timestamp );
		SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );

		sdf.setTimeZone( TimeZone.getTimeZone( "GMT" ) );
		String formattedDate = sdf.format( date );
		System.out.println( formattedDate );

		assertTrue( true );
	}

}
