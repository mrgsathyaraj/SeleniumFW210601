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
        plugin = {"pretty", // to generate reports
                //"html:target/html/htmlreport.html",
               // "json:target/json/file.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        publish=true


)
public class RunnerTest {

}
