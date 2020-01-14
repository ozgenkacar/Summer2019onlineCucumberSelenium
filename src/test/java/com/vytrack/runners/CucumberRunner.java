package com.vytrack.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/vytrack/step_definitions",
        dryRun = false,
        tags ="@smoke_test",
        plugin = {"html:target/default-cucumber-reports",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        }
)
//  tags = "@negative_test" --> run tests only with this tag
//  tags = "not @negative_test" --> run tests only without this tag
//  tags = "~@negative_test" --> run tests only without this tag (old way)
//  tags = "@negative_test or @driver" --> run tests with negative or @driver tags
//  tags = "@negative_test and @driver" --> run scenarios that have both tags only, not either or
//  tags ="" --> everything will be executed

public class CucumberRunner {




}
