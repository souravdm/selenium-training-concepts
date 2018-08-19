package com.seleniumtraining.session11and12.seleniumbasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class SeleniumMethods2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\ToolsQAJARS\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
	
	
		ChromeDriver chrome = new ChromeDriver(options);

		// page load timeout
		chrome.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		// implicit wait
		chrome.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// maximize window
		//chrome.manage().window().maximize();

		chrome.get("http://shop.demoqa.com/product-tag/women/");

		// clear and getAttribute
//		
//		String[] userNames = {"souvik@gmail.com","ray@gmail.com","roma@gmail.com","andy@gmail.com","rosa@gmail.com"};
//
//		for(String userName :  userNames) {
//			chrome.findElement(By.xpath(".//input[@id='username']")).clear(); // clearing the input field
//			chrome.findElement(By.xpath(".//input[@id='username']")).sendKeys(userName);
//		
//			String currValue = chrome.findElement(By.xpath(".//input[@id='username']")).getAttribute("value");
//			if(currValue.equals(userName)) {
//				System.out.println("PASS");
//			}else {
//				System.out.println("FAIL");
//			}
//		}
//		
		List<WebElement> breadCrum =  chrome.findElements(By.xpath(".//div[@class='noo-page-breadcrumb']/span"));
		
		String temp = null;
		
		for(WebElement bread : breadCrum) {
			temp = bread.getText();
			System.out.println("Bread crum text : "+ temp);
		}
		
		String[] currURL = chrome.getCurrentUrl().split("/");
		
		if(currURL[currURL.length-1].equalsIgnoreCase(temp)) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
		
		
		
	}
	
}
