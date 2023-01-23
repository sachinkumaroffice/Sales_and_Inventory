package com.sample.page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoIbibo {

	
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//p[.='Enter city or airport']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Bengaluru");
		WebElement option = driver.findElement(By.xpath("(//div[@class='Wnj bRMwkb'])[1]"));
		Thread.sleep(5000);
		option.click();
		Actions action = new Actions(driver);
		action.moveByOffset(20, 20);
		driver.findElement(By.xpath("//p[.='Enter city or airport']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Delhi");
		driver.findElement(By.xpath("(//div[@class='sc-jObWnj bRMwkb'])[1]")).click();
		driver.findElement(By.xpath("//span[.='Departure']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Wed Jan 25 2023']")).click();
		driver.findElement(By.xpath("//div[@class='sc-nVkyK kXKaJU']/span[.='Done']")).click();
		driver.findElement(By.linkText("Done")).click();
		driver.findElement(By.xpath("//p[.='Click to add a return flight for better discounts']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Mon Feb 13 2023']")).click();
		driver.findElement(By.xpath("//span[text()='Done']")).click();
		driver.findElement(By.xpath("//span[text()='SEARCH FLIGHTS']")).click();
		
	}
}
