package com.seleniumtraining.session11and12.seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumMethods6 {

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

		chrome.get("https://www.amazon.co.uk/");
		
		WebElement category =  chrome.findElement(By.xpath(".//select[@title='Search in']"));
		
		Select sel = new Select(category);
		
		for(WebElement ele :  sel.getOptions()) {
			System.out.println(ele.getText());
		}
		
		sel.selectByVisibleText("PC & Video Games");
		
		
		

	}

}
