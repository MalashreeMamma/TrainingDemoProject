
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class Cucumberrunner {
	
	@RunWith(Cucumber.class)
	@CucumberOptions(
	features = "Include/features/Loginpractice.feature",
	glue = "",
	plugin = {
	"pretty",
	"html:BDDReports/HTML",
	"json:BDDReports/JSON/reports.json"
	}
	)
	public class CucumberRunner {
	}

}