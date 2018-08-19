package com.seleniumtraining.session3and4.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/souravmahapatra/Documents/sourav/Selenium/chromedriver");
		
		ChromeDriver chrome = new ChromeDriver();
		
		chrome.get("https://www.amazon.co.uk/");
		
		// page load timeout 
		 chrome.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		
		// implicit wait
		 chrome.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		 
		 // maximize window
		 chrome.manage().window().fullscreen();
		 
		 chrome.findElement(By.xpath(".//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 6");
		 
		 chrome.findElement(By.xpath(".//input[@value='Go']")).click();
		 
		 if(chrome.findElement(By.xpath(".//a[@id='bcKwText']/span")).getText().contains("oneplus 6")) {
			 System.out.println("Test Passed");
		 }else {
			 System.out.println("Test Fail");
		 }
		 chrome.close();
		 chrome.quit();
		
		
	}

}
