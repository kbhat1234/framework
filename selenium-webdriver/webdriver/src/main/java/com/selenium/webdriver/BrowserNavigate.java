package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigate extends LiciousHomePage {
	
	
	WebDriver driver = null;
	LiciousHomePage h = new LiciousHomePage();
	
	public void navigateCommands() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthik.k\\core-java\\selenium-webdriver\\webdriver\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://web.licious.in");
		h.chooseDeliveryLocation();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[@data-index='1']")).click();
		driver.navigate().back();
		driver.navigate().forward();
	}
};