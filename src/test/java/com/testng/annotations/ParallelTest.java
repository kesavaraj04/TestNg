package com.testng.annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTest {
	@Test
	private void amazon() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kesav\\eclipse-workspace\\TestNG_Concepts\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		
		
	}
	@Test
	private void flipkard() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\kesav\\eclipse-workspace\\TestNG_Concepts\\driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}

}
