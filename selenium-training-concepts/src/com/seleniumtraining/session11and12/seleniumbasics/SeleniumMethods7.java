package com.seleniumtraining.session11and12.seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumMethods7 {

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

		chrome.get("http://www.ksrtc.in/oprs-web/guest/home.do?h=1");
		
		chrome.findElement(By.xpath(".//input[@name='fromPlaceName']")).sendKeys("BANGALORE");;
		
		chrome.findElement(By.xpath(".//input[@name='searchBtn']")).click();
		
		Alert alert = chrome.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.accept();
		
		
		

	}

}
