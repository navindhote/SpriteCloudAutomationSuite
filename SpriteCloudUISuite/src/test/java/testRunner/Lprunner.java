package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"Features"},
		glue={"stepDefinations.sub"},
		monochrome = true, tags="@UITestRun",
		plugin = {"pretty","html:target/cucumber-reports/report.html","json:target/cucumber-reports/Cucumber.json","junit:target/cucumber-reports/Cucumber.xml"}
		
		)
public class Lprunner {

}
