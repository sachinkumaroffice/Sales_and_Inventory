package com.sample.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DataPage {

	
	
	@Test
	public void connectToDB() {
		WebDriver driver;
		
		String URL = System.getProperty("url");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		String BROWSER = System.getProperty("browser");
		
		
		System.out.println("URL-----"+ URL);
		System.out.println("Browser -----"+ BROWSER);
		System.out.println("Username---- "+ USERNAME);
		System.out.println("Password ---- "+ PASSWORD);
		driver = new FirefoxDriver();
		driver.get(URL);
	}
	
}
