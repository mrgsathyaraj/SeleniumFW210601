package com.test.StepDef;

import com.test.Core.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    WebDriver driver;
    Scenario scn;
    TestContext testContext;

    public Hooks(TestContext testContext)
    {
        this.testContext = testContext;
       // driver = testContext.driver; (optional)
    }


    @Before
    public void setUp(Scenario scn)
    {

        testContext.initializedriver();
        testContext.initializePageObjects();
        testContext.scn= scn;
    }

   /* @After
    public void CloseBrowser()
    {
        testContext.closedriver();
    }*/
}
