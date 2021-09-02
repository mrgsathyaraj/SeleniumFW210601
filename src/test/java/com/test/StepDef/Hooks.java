package com.test.StepDef;

import com.test.Core.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Hooks {

    WebDriver driver;
    //Scenario scn;
    TestContext testContext;

    public Hooks(TestContext testContext)
    {
        this.testContext = testContext;
       // driver = testContext.driver;
    }


  @Before
    public void setUp(Scenario scn) throws IOException {

        testContext.initializedriver();
        testContext.initializePageObjects();
        testContext.scn= scn;
    }

    @After(order = 1)
    public void CloseBrowser()
    {
       // testContext.closedriver();
    }

/*    @AfterStep
    public void takeScreenShot(Scenario scn) {
        if (scn.isFailed()) {
            TakesScreenshot scrnShot = (TakesScreenshot)testContext.driver;
            byte[] data = scrnShot.getScreenshotAs(OutputType.BYTES);
            scn.attach(data, "image/png","Failed Step Name: " + scn.getName());
        }else{
            scn.log("Test case is passed, no screen shot captured");
        }
    }*/

    @AfterStep
    public void takeScreenShot(Scenario s) {

            TakesScreenshot scrnShot = (TakesScreenshot)testContext.driver;
            byte[] data = scrnShot.getScreenshotAs(OutputType.BYTES);
            s.attach(data, "image/png","Failed Step Name: " + s.getName());

    }
}
