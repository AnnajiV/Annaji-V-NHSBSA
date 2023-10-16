package runner;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import com.report.CucumberExtentOptions;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "src/test/resources",
		glue={"stepDefinition"},
		tags= {"@ftag1"},
		monochrome=true,
		plugin= {"com.report.CucumberExtent:target/cucumber-extent-reports/report.html"}
		)

public class TestNGRunner extends AbstractTestNGCucumberTests{
	
	@BeforeClass
	public void beforeMethod() {
		CucumberExtentOptions.getInstance().setDocumentTitle("Test Technical Exercise");
		//CucumberExtentOptions.getInstance().setReportLevel("Feature");
		CucumberExtentOptions.getInstance().setReportName("Test Technical Exercise");		
	}
}
