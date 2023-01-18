package com.sample.page;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipKart {
	public static void main(String[] args) throws Throwable {
	
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get("https://www.flipkart.com/");
	 Actions action = new Actions(driver);
	 action.moveByOffset(10, 10).click().perform();
	// driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	 driver.findElement(By.xpath("//div[text()='TVs & Appliances']")).click();
	 WebElement TV = driver.findElement(By.xpath("//span[text()='TVs & Appliances']"));
	 action.moveToElement(TV,0,0).perform();
	 driver.findElement(By.linkText("Window ACs")).click();
	 
	 JavascriptExecutor jse = (JavascriptExecutor) driver;
	 for(;;) {
		 Thread.sleep(500);
		 jse.executeScript("window.scrollBy(0,500)");
		 if (driver.findElement(By.xpath("//div[.='Blue Star 1 Ton 2 Star Window AC  - White']")).isDisplayed()) {
			break;
		}
	 }
	 String name = driver.findElement(By.xpath("//div[text()='Blue Star 1 Ton 2 Star Window AC  - White']")).getText();
	 System.out.println(name);
	 String price = driver.findElement(By.xpath("//div[text()='Blue Star 1 Ton 2 Star Window AC  - White']/../..//div[@class='_30jeq3 _1_WHN1']")).getText();
	 System.out.println(price);
	 driver.quit();
	}
}
