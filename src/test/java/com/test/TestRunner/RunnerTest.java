package com.test.TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(

        features = "classpath:Features",
        glue="", //step def path
        tags="@smoke",
        dryRun = false,
        monochrome = true,
        plugin = {"pretty", "html:target/html-report/cucumber.html"}


)
public class RunnerTest {

}
