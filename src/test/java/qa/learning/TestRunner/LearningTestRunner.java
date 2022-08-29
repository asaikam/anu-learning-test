package qa.learning.TestRunner;

import org.junit.BeforeClass;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/qa/learning/FeatureFiles/",
		tags="@TS01",
		plugin= {"pretty", "html:target/cucumber-html-report.html", "json:target/cucumber-json-report.json"} ,
		monochrome= true,
		glue = "qa.learning.StepDefination")

public class LearningTestRunner
{
	@BeforeClass
	public static void startTest() {
		System.out.println("SwagLabs Test Started: ");
	}
}

