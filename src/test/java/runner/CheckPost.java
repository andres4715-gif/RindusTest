package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;

@CucumberOptions(
		features={"src/test/java/features/CheckPosts.feature"}
		,glue={"StepDefinitions", "utility"}
		, dryRun = false
		, monochrome = false
		, plugin = {"pretty", "html:target/HTMLReports/report.html"}
		, tags ={"@appium"}
		)
@Test
public class CheckPost extends AbstractTestNGCucumberTests{

}
