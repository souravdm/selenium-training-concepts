package com.seleniumtraining.session11and12.seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumMethods5 {

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

		chrome.get("https://semantic-ui.com/modules/dropdown.html");
	
		
		WebElement h4 = chrome.findElement(By.xpath(".//h4[text()='Multiple Search Selection']"));
		WebElement country =  chrome.findElement(By.xpath(".//p[contains(text(),'multiple search')]/following-sibling::div/select"));
		
		ScrollToElement(chrome,country);
		
		Actions act = new Actions(chrome);
		
		((JavascriptExecutor)chrome).executeScript("arguments[0].scrollIntoView();", chrome.findElement(By.xpath(".//div[@class='ui ignored info message']")));
		
		//act.moveToElement(chrome.findElement(By.xpath(".//div[@class='ui ignored info message']"))).click().build().perform();;
		
		//act.moveToElement(h4).click().build().perform();
		
		act.moveToElement(country).click().build().perform();
		
		country.click();
		
		Select sel = new Select(country);
		
		for(WebElement ele :  sel.getOptions()) {
			System.out.println(ele.getText());
		}
		
		sel.selectByIndex(3);
		sel.selectByIndex(5);
		
		h4.click();
		
		

	}
	
	public static void ScrollToElement(WebDriver driver) {
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,2000)");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}
	
	public static void ScrollToElement(WebDriver driver, WebElement ele) {
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", ele);
	}

}
