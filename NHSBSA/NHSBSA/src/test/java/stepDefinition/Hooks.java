package stepDefinition;



import com.sbsa.TestBase;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	TestBase testBase;


	@Before
	public void initializeTest() {
		testBase = new TestBase();
		testBase.selectBrowser("CHROME");
	}
	
	@After
	public void tearDown() {
		testBase.getDriver().close();
		testBase.getDriver().quit();
	}
}
