package com.seleniumtraining.session1and2.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsInWebPage {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/souravmahapatra/Documents/sourav/Selenium/chromedriver");
		
		ChromeDriver driver = new ChromeDriver(); // creating an instance of chrome browser (ctrl+shift+o)
		
		// configuration
		driver.manage().window().fullscreen(); // maximize the window
		
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		//driver.findElement(By.xpath(".//*[@id='content']/form/fieldset/div[1]/a[1]/strong")).click();
		
		driver.findElement(By.xpath(".//input[@name='firstname']")).sendKeys("Souvik");
		
		driver.findElement(By.xpath(".//input[@name='lastname']")).sendKeys("ToolsQA");
		
		driver.findElement(By.xpath(".//*[@id='submit']")).click();
		driver.close();
		driver.quit();
		
		
		
	}

}
