package cucumber.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features=".\\featurefile",glue= {"cucumber.cucumber"},dryRun=false,tags= {"@smoke"},
format={"pretty","html:target/cucumber-html-report"},
monochrome=true)
public class Runner {

}
