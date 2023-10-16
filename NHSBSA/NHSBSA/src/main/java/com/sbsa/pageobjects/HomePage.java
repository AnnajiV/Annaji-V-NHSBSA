package com.sbsa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sbsa.TestBase;


public class HomePage extends TestBase{
	private WebDriver driver;

	@FindBy(xpath="//*[@id='nhsuk-cookie-banner__link_accept']")
	public WebElement doNotUsecookies;
	
	@FindBy(xpath="//*[@id='next-button']")
	public WebElement startNowButton;
	
	@FindBy(xpath="//*[@id='radio-england']")
	public WebElement englandRadioButtion;
	
	@FindBy(xpath="//*[@id='next-button']")
	public WebElement nextButton;
	
	@FindBy(xpath="//*[@id='radio-no']")
	public WebElement noRadioButtion;
	
	@FindBy(xpath="//*[@id='dob-day']")
	public WebElement dobDayTextBox;
	
	@FindBy(xpath="//*[@id='dob-month']")
	public WebElement dobMonthTextBox;

	@FindBy(xpath="//*[@id='dob-year']")
	public WebElement dobYearTextBox;
	
	@FindBy(xpath="//*[@id='result-heading']/span[1]")
	public WebElement resultHeading1;
	
	@FindBy(xpath="//*[@id='result-heading']/span[2]")
	public WebElement resultHeading2;
	
	
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		//waitHelper = new WaitHelper(driver);
		//waitHelper.WaitForElement(userName, 60);
	}
	
	public void proceed() {
		if(doNotUsecookies.isDisplayed()) {
			doNotUsecookies.click();
		}
		startNowButton.click();
		 
	}
	
	public void clickwhichCountryDoYouLiveIn() {
		englandRadioButtion.click(); 
	}
	
	public void nextButton() {
		nextButton.click(); 
	}
	
	public void clickIsyourGPpracticeinScotlandorWales() {
		noRadioButtion.click(); 
	}
	
	public void selectWhichcountryisyourdentalpracticein() {
		englandRadioButtion.click();
	}
	
	public void fillWhatisyourdateofbirth(String day, String month ,String year) {
		dobDayTextBox.sendKeys(day);
		WaitForElement(dobMonthTextBox);
		dobMonthTextBox.sendKeys(month);
		WaitForElement(dobMonthTextBox);
		dobYearTextBox.sendKeys(year);
	}
	
	public void clickDoyoulivewithapartner() {
		noRadioButtion.click();
	}
	
	public void clickDoyouclaimanybenefitsortaxcredits() {
		noRadioButtion.click();
	}
	
	public void clickAreyoupregnantmonths() {
		noRadioButtion.click();
	}
	
	public void clickDoyouhaveaninjuryorillness() {
		noRadioButtion.click();
	}
	
	public void clickDoyouhavediabetes() {
		noRadioButtion.click();
	}
	
	public void clickTocheckwhathelpyoucangetwith() {
		noRadioButtion.click();
	}
	
	public void clickDoyouhaveglaucoma() {
		noRadioButtion.click();
	}
	
	public void clickDoyoulivepermanentlyinacarehome() {
		noRadioButtion.click();
	}
	
	public void clickDoyouhavemorethan£16000insavings() throws InterruptedException {
		//WaitForElement(noRadioButtion);
		noRadioButtion.click();
		
		if(noRadioButtion.isDisplayed()) {
			noRadioButtion.click();
		}
	}
	
	public String GetResult() throws InterruptedException {
		Thread.sleep(5000);
		WaitForElement(resultHeading2);
		return resultHeading2.getText().trim();
	}
	
	

}
