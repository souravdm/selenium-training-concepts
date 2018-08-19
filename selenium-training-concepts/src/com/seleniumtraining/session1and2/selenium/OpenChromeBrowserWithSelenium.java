package com.seleniumtraining.session1and2.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowserWithSelenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/souravmahapatra/Documents/sourav/Selenium/chromedriver");
		
		ChromeDriver driver = new ChromeDriver(); // creating an instance of chrome browser (ctrl+shift+o)
		
		// configuration
		driver.manage().window().fullscreen();// maximize the window
		
	/*	driver.navigate().to("http://shop.demoqa.com/"); // launching application
		
		driver.findElement(By.xpath(".//a[text()='Cart']")).click(); // navigating to Cart page
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();*/
		
		//*****************************************************************
		
		driver.get("http://shop.demoqa.com/");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		driver.close();
		driver.quit();
		
		
		
	}

}
