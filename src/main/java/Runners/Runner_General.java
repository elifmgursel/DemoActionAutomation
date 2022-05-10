package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (

    features = {"src/test/java"},
    glue = {"StepDefinitions"},
        dryRun = false)

public class Runner_General extends AbstractTestNGCucumberTests {
}

