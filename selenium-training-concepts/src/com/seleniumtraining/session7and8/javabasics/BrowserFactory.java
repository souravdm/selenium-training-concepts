package com.seleniumtraining.session7and8.javabasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
	public static WebDriver driver = null;
	
	public BrowserFactory() {
		driver = new FirefoxDriver();
	}
	
	public WebDriver getWebDriver() {
		return driver;
	}
	

}
