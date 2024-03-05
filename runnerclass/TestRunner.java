package runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun = false,
		monochrome = true,
		features = "src/test/resource/features",
		glue = {"stepdefinitions","hooks"},
		tags = "@all",
		plugin = { "pretty",
				"html:target/CucumberReports/CucumberReport.html",
				"json:target/CucumberReports/CucumberReport.json",
				"junit:target/CucumberReports/CucumberReport.xml"
				}
		//publish = true
		)
public class TestRunner {

}
