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

public class SeleniumMethods3 {

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

		chrome.get("https://www.tripadvisor.ie/");
		
		WebElement filter =  chrome.findElement(By.xpath(".//span[@class='traveler_info_text']"));
		
		try {
			
			
			int X = filter.getLocation().getX();
			int Y = filter.getLocation().getY();
			
			System.out.println(X +"--"+ Y);
			
			Actions act = new Actions(chrome);
			
			act.moveByOffset(X, Y).perform();
			
			act.moveToElement(filter).perform();
			
			act.click().perform();
			
//			Robot robo = new Robot();
//			robo.mouseMove(X,Y);
//				
//			
//			robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//			robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//			
		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

}
