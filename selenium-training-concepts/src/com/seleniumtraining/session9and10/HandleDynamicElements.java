package com.seleniumtraining.session9and10;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleDynamicElements {

	public static void main(String[] args) {
		
		By TXTBOX = By.xpath(".//div[@class='text-boxes']/input");
	
		System.setProperty("webdriver.chrome.driver", "/Users/souravmahapatra/Documents/sourav/Selenium/chromedriver");
		ChromeDriver chrome = new ChromeDriver();

		// page load timeout
		chrome.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		// implicit wait
		chrome.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// maximize window
		//chrome.manage().window().fullscreen(); 

		chrome.get("https://www.tripadvisor.ie/SmartDeals-g186605-Dublin_County_Dublin-Hotel-Deals.html");
		
		waitForElement(chrome,chrome.findElement(By.xpath(".//h1[@class='header heading masthead masthead_h1 ']"))).click();
		
		ScrollToElement(chrome);
		
		List<WebElement> hotels = chrome.findElements(By.xpath(".//div[contains(@class,'listItem')]"));
			
		int counter = 0; WebElement ele;
		
		for(int i=0; i <= hotels.size()-1; i++) {
			
			List<WebElement> hotel = chrome.findElements(By.xpath(".//div[contains(@class,'listItem')]"));
				
			System.out.println("Hotel Name : "+ waitForElement(chrome,hotel.get(i).findElement(By.xpath("descendant::div[@data-prwidget-name='meta_hsx_listing_name']"))).getText());
			System.out.println("Current Price : "+ waitForElement(chrome,hotel.get(i).findElement(By.xpath("descendant::div[contains(@class,'allowEllipsis')]/div[2]//div[@data-sizegroup='mini-meta-price']"))).getText());				
			System.out.println("Reviews : "+ waitForElement(chrome, hotel.get(i).findElement(By.xpath("descendant::a[contains(text(),'reviews')]"))).getText());
			
			System.out.println(" ============================================================ ");
			counter = i;
			
		}
		
		System.out.println("No of hotels present : "+ counter);
		System.out.println("No of hotels present : "+ hotels.size());
		
		chrome.quit();
	}
	
	public static WebElement waitForElement(WebDriver driver, WebElement ele) {	
		return new WebDriverWait(driver,10)
				    .ignoring(StaleElementReferenceException.class)
				    .until(ExpectedConditions.elementToBeClickable(ele));
	}
	
	public static void ScrollToElement(WebDriver driver) {
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		
	}

}
