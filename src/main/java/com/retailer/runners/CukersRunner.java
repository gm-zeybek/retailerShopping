package com.retailer.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        publish = true,
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
        features = "src/main/resources/features/",
        glue = "com/retailer/steps",
        dryRun = false,
        tags=""

)

public class CukersRunner {
}
