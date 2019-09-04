package mybdcrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(features="Features99", glue = "bdcstepdefinitions",tags= {"@Sanity,@Regression"})
//@CucumberOptions(features="Features99", glue = "bdcstepdefinitions",tags= {"@Smoke"})
@CucumberOptions(features="C:\\Users\\nanthini.kalimuthu\\Nanthini_Demo_Cucumber\\Features99\\BDC_Demo01.feature",glue = "bdcstepdefinitions",
plugin = {"pretty","html:target/cucumber-html-report",
         "json:target/NanthiniDemo-JSON-report"})

public class BDCRunner {

}
