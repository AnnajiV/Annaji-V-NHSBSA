package com.sbsa;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;



public class TestBase {

	public static WebDriver driver;
	public WebDriver selectBrowser(String browser) {
		
		if(browser.toUpperCase().equals("CHROME")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(); 
			driver.manage().window().maximize();
			driver.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
		}
		
		return driver;
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public void WaitForElement(WebElement element){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}
