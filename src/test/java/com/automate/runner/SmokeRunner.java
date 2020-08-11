package com.automate.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/automate/stepDefinition",
        features = "src/test/resources",
        dryRun =false,
        strict = true,
        tags =  "@smoke",
        plugin = {
                "html:target/default-report",
                "json:target/cucumber1.json",
                "rerun:target/rerun.txt"
        }
//We put CR*D Comment in smoke test

)
public class SmokeRunner {
}
