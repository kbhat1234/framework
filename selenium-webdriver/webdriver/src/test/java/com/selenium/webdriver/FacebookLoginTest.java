package com.selenium.webdriver;

public class FacebookLoginTest {

	public static void main(String[] args) {
		FacebookLogin fb = new FacebookLogin();
		fb.init();
		fb.browserLaunch();
		fb.tagName();
		fb.tearDown();
	}
};