package com.test.Core;

import com.test.PageObjects.CommonPageObjects;
import com.test.PageObjects.MainSearchPageObjects;
import com.test.PageObjects.MainSerachFiltersPageObjects;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

public class TestContext {

    public String baseURL="https://www.amazon.in/";
    public int implicit_timeout_in_sec=2000;
    public WebDriver driver;
    public Scenario scn;
    public String browsernName = "chrome";

    public MainSearchPageObjects mainsearchpageobjects;
    public MainSerachFiltersPageObjects mainsearchfilterspageobjects;
    public CommonPageObjects CommonPageObjects;
    public void initializedriver()
    {
        String browser= WebDriverFactory.browserName(browsernName);
        driver= WebDriverFactory.GetBrowserConnection(browser);
        driver.get(baseURL);

    }

    public void closedriver()
    {
        driver.quit();
    }

    public void initializePageObjects()
    {
        mainsearchpageobjects = new MainSearchPageObjects(driver);
        mainsearchfilterspageobjects =  new MainSerachFiltersPageObjects(driver);
        CommonPageObjects = new CommonPageObjects(driver);

    }

}
