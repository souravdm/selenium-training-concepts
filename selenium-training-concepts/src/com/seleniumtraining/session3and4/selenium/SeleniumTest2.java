package com.seleniumtraining.session3and4.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/souravmahapatra/Documents/sourav/Selenium/chromedriver");
		ChromeDriver chrome = new ChromeDriver();

		// page load timeout
		chrome.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		// implicit wait
		chrome.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// maximize window
		chrome.manage().window().maximize();

		chrome.get("https://www.amazon.co.uk/");

		String link_footer = ".//td[@class='navFooterLinkCol'][2]//ul/li/a";
		
		System.out.println(chrome.findElements(By.xpath(link_footer)).size());

		List<WebElement> footerLinks = chrome.findElements(By.xpath(link_footer));  // just to run the loop

		// ctrl + shift + o > eclipse
		
		int counter = 0;

		for (WebElement link : footerLinks) {
			
			// List of web Element 
			List<WebElement> links = chrome.findElements(By.xpath(link_footer));
			
			System.out.println(links.size());
			
			WebElement aLink = links.get(counter);
			
			aLink.click();
			
			String url = chrome.getCurrentUrl();
			System.out.println(url);
			if(url.contains("amazon")) {
				System.out.println("Test Passed");
			}else {
				System.out.println("Test Failed");
			}
			chrome.navigate().back();
			counter++;
		}

	}

}
