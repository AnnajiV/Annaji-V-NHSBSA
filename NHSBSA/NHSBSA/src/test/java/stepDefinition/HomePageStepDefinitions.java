package stepDefinition;

import org.testng.Assert;
import com.sbsa.TestBase;
import com.sbsa.pageobjects.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepDefinitions extends TestBase {

	HomePage homePage = new HomePage(driver);

	@Given("I am a citizen of the UK")
	public void I_am_a_citizen_of_the_UK(){
		homePage.proceed();
	}

	@When("I put my circumstances into the Checker tool")
	public void I_put_my_circumstances_into_the_Checker_tool() throws InterruptedException {
		homePage.clickwhichCountryDoYouLiveIn();
		homePage.nextButton();
		homePage.clickIsyourGPpracticeinScotlandorWales();
		homePage.nextButton();
		homePage.selectWhichcountryisyourdentalpracticein();
		homePage.nextButton();
		homePage.fillWhatisyourdateofbirth("01", "01", "1990");
		homePage.nextButton();
		homePage.clickDoyoulivewithapartner();
		homePage.nextButton();
		homePage.clickDoyouclaimanybenefitsortaxcredits();
		homePage.nextButton();
		homePage.clickAreyoupregnantmonths();
		homePage.nextButton();
		homePage.clickDoyouhaveaninjuryorillness();
		homePage.nextButton();
		homePage.clickDoyouhavediabetes();
		homePage.nextButton();
		homePage.clickTocheckwhathelpyoucangetwith();
		homePage.nextButton();
		homePage.clickDoyouhaveglaucoma();
		homePage.nextButton();
		homePage.clickDoyoulivepermanentlyinacarehome();
		homePage.nextButton();
		homePage.clickDoyouhavemorethan£16000insavings();
		homePage.nextButton();
		if(homePage.nextButton.isDisplayed()) {
			homePage.nextButton();
		}
	}

	@Then("I should get a result of whether I will get help or not")
	public void I_should_get_a_result_of_whether_I_will_get_help_or_not() throws InterruptedException {
		String ActualResult = "You could get help to pay for your NHS costs";
		String ExpectedResult = homePage.GetResult();
		
		Assert.assertEquals(ActualResult, ExpectedResult);
		
	}
}
