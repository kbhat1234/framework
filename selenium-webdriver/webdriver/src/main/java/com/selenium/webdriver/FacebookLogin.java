package com.selenium.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	WebDriver driver = null;
	
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\karthik.k\\\\core-java\\\\selenium-webdriver\\\\webdriver\\\\drivers\\\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public void browserLaunch() {
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	public void tagName() {
		String tagName1 = driver.findElement(By.id("email")).getTagName();
		System.out.println(tagName1);
		String tagName2 = driver.findElement(By.id("pass")).getTagName();
		System.out.println(tagName2);
	}
	
	public void tearDown() {
		driver.close();
		driver.quit();
	}
};