package com.test.TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(

        features = "classpath:Features",
        glue="",
        tags="@smoke",
        dryRun = false

)
public class RunnerTest {
}