package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CloseAll {
	@Test(priority=3)
	void test1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthik.k\\core-java\\selenium-webdriver\\webdriver\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://guru99.com");
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[@title='Learn Java']")).click();
		driver.navigate().back();
		driver.navigate().forward();
	}
	
	@Test(priority=1)
	void test2() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthik.k\\core-java\\selenium-webdriver\\webdriver\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://guru99.com");
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[@title='Learn Java']")).click();
		driver.navigate().back();
		driver.navigate().forward();
	}
};