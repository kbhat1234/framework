package com.selenium.webdriver;

public class LiciousHomePageTest {

	public static void main(String[] args) throws InterruptedException {
		LiciousHomePage p = new LiciousHomePage();
		ChickenCategoryProductListing c = new ChickenCategoryProductListing();
		System.out.println(p.baseURL);
		p.setup();
		//p.links();
		p.chooseDeliveryLocation();
		//p.categoryLinks();
		//c.productListing();
		c.getText();
		p.tearDown();
	}
};