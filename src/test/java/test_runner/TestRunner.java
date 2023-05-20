package test_runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

//@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/test/resources/features"},
        glue = {"steps_definitions"},
//        monochrome = true,
        plugin = {
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "json:Reports/cucumber.json",
                "html:docs/Cucumber.html",
                "rerun:target/rerun.txt",
                "junit:Reports/Cucumber-results.xml",
                "pretty"
        }
)

public class TestRunner extends AbstractTestNGCucumberTests {
        @Override
        @DataProvider
        public Object[][] scenarios(){
                return super.scenarios();
        }
}
