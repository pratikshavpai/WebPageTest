package com.selenium.test.test.webpage;

import java.sql.Driver;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.*;

//import static org.testng.Assert.assertEquals;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String args[]) throws InterruptedException {

		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "/Users/pk/Downloads/FireFox/geckodriver");
		driver = new FirefoxDriver();
		String actualTitle = "";
		String expectedTitle = "Welcome: Mercury Tours";
		String baseUrl = "http://newtours.demoaut.com";
		driver.get(baseUrl);
		actualTitle = driver.getTitle();
		System.out.println(driver.getTitle());

		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed");
		}
		driver.navigate().to("http://newtours.demoaut.com/mercuryregister.php");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();

		Thread.sleep(2000);
		driver.close();
		driver.quit();
		System.out.println("1");
		// exit the program explicitly

		System.exit(0);
		System.out.println("2");

	}

}
