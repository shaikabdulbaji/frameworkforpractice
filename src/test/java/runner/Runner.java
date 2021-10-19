package runner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
			features="src/test/java/features",
			glue="stepdefinition"
		)
@Test
public class Runner extends AbstractTestNGCucumberTests {

}
