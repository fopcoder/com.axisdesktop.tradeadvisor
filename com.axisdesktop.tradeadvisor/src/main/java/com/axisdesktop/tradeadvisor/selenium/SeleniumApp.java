package com.axisdesktop.tradeadvisor.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumApp {

	public static void main( String[] args ) throws InterruptedException {

		System.setProperty( "webdriver.chrome.driver",
				"C:\\Users\\coder\\Downloads\\chromedriver_win32\\chromedriver.exe" );

		ChromeOptions options = new ChromeOptions();
		options.addArguments( "disable-infobars" );

		WebDriver driver = new ChromeDriver( options );
		driver.get(
				"https://poloniex.com/public?command=returnChartData&currencyPair=BTC_XMR&start=1405699200&end=9999999999&period=14400" );

		driver.switchTo().frame( 0 );

		WebElement captcha = driver.findElement( By.cssSelector( "div.recaptcha-checkbox-checkmark" ) );
		System.out.println( captcha );
		Thread.sleep( 5_000 );
		captcha.click();

		Set cookies = driver.manage().getCookies();

		/*
		 * public static void main(String[] args) throws Exception {
		 * LogFactory.getFactory().setAttribute("org.apache.commons.logging.Log",
		 * "org.apache.commons.logging.impl.NoOpLog");
		 * 
		 * File file = new File("cookie.file"); ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
		 * Set<Cookie> cookies = (Set<Cookie>) in.readObject(); in.close();
		 * 
		 * WebClient wc = new WebClient();
		 * 
		 * Iterator<Cookie> i = cookies.iterator(); while (i.hasNext()) { wc.getCookieManager().addCookie(i.next()); }
		 * 
		 * HtmlPage p = wc.getPage("http://google.com");
		 * 
		 * ObjectOutput out = new ObjectOutputStream(new FileOutputStream("cookie.file"));
		 * out.writeObject(wc.getCookieManager().getCookies()); out.close(); }
		 */

		// WebDriver driver = new FirefoxDriver();
		//
		// // Launch the Online Store Website
		// driver.get( "http://google.com" );
		//
		// // Print a Log In message to the screen
		// System.out.println( "Successfully opened the website www.Store.Demoqa.com" );

		// Wait for 5 Sec
		// Thread.sleep( 5000 );

		// Close the driver
		// driver.quit();

	}

}
