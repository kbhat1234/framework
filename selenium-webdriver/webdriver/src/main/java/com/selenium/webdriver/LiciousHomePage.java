package com.selenium.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LiciousHomePage {
	
	WebDriver driver=null;
	String baseURL="https://web.licious.in/";
	String expectedTitle="Buy meat online |Shop for tender and fresh meat online |Licious.in";
	
	public void BrowserInit() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthik.k\\core-java\\selenium-webdriver\\webdriver\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\karthik.k\\core-java\\selenium-webdriver\\webdriver\\drivers\\geckodriver.exe");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void setup() {
		BrowserInit();
		driver.get(baseURL);
		System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebElement phone = driver.findElement(By.xpath("//ul/li[3]"));
		String number = phone.getText();
		if(number.contentEquals("| 1800-4190-786")) {
			
			System.out.println("Tests passed");
		}
		else {
			
			System.out.println("Tests failed");
		}
		Assert.assertEquals(number, "| 1800-4190-786");
		WebElement logo = driver.findElement(By.xpath("//div[@class='header-logo']"));
		System.out.println(logo.isDisplayed());
		System.out.println(logo.getTagName());
		
	}
	
	public void links() {
		String actualTitle = driver.getTitle();
		//if(actualTitle.contentEquals(expectedTitle)) {
			if(actualTitle.contains("online")) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println(actualTitle);
		WebElement link1 = driver.findElement(By.linkText("Why Licious?"));
		link1.click();
	}
	
	public void chooseDeliveryLocation() throws InterruptedException {
		WebElement selectedLoc = driver.findElement(By.xpath("//span[@class='city_blr active']"));
		selectedLoc.click();
		WebElement usemyloc = driver.findElement(By.xpath("//div[@class='use-my-loc']"));
		usemyloc.click();
		Thread.sleep(3000);
	}
	
	/*public void categoryLinks() throws InterruptedException {
		WebElement index_1 = driver.findElement(By.xpath("//a[@data-index='1']"));
		index_1.click();
		Thread.sleep(3000);
	}*/

	public void tearDown() {
		driver.close();
		driver.quit();
	}
};