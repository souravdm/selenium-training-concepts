package com.seleniumtraining.session11and12.seleniumbasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class SeleniumMethods {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/souravmahapatra/Documents/sourav/Selenium/chromedriver");
		
		ChromeDriver chrome = new ChromeDriver(); // creating an instance of chrome browser (ctrl+shift+o)
		
		// configuration
		chrome.manage().window().fullscreen(); // maximize the window
		

		// page load timeout
		chrome.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		// implicit wait
		chrome.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// maximize window
		//chrome.manage().window().maximize();

		chrome.get("https://www.expedia.ie/");
		
		chrome.findElement(By.xpath(".//input[@name='phoneNumber']")).sendKeys("0894740999a");
		
		chrome.findElement(By.xpath(".//button[@class='btn-secondary btn-sub-action']")).click();
		
		//#d2e6c8  //#fad4d4
		
		if(chrome.findElement(By.xpath("(.//span[@class='title'])[1]/following-sibling::div"))
				.getCssValue("background").contains("210, 230, 200")) {
			System.out.println("success");
		}else if(chrome.findElement(By.xpath("(.//span[@class='title'])[1]/following-sibling::div"))
				.getCssValue("background").contains("250, 212, 212")) {
			System.out.println("error");
		}	
		
		//chrome.findElement(By.xpath("(.//span[@class='title'])[1]/following-sibling::div")).
		
	}
	
}
