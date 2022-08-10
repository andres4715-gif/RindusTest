package runner;

import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features={"src/test/java/features"}
		,glue={"stepdefinations", "utility"}
		, dryRun = false
		, plugin = {"pretty", "html:target/HTMLReports/report.html"}
		, tags ={"@appium"}
		)
@Test
public class RunTest extends AbstractTestNGCucumberTests{

}
