package com.sample.page;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosugg {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("honesty");
		List<WebElement> webElements = driver.findElements(By.xpath("//span[text()='honesty']"));
		for (int i = 0; i < 10; i++) {
//			if (i<3) {
//				System.out.println(webElements.get(i).getText());
//			} else {
//				String ele = webElements.get(i).getText();
//				
//			}
			System.out.println(webElements.get(i).getText());
			
		}
	}

}
