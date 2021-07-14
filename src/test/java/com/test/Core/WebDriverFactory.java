package com.test.Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverFactory {

    private static WebDriver driver = null;

    public static WebDriver GetBrowserConnection(String browser)
    {
        if (browser.equals("chrome")) {
            driver = new ChromeDriver();
        }
        else if(browser.equals("edge"))
        {
            System.setProperty("webdriver.edge.verboseLogging", "true");
            EdgeDriverService service = EdgeDriverService.createDefaultService();
            EdgeOptions options = new EdgeOptions();
            driver = new EdgeDriver(service, options);
        }
        else if(browser.equals("opera"))
        {
            driver = new OperaDriver();
        }
        else if(browser.equals("mozilla"))
        {
            driver = new FirefoxDriver();
        }

        else{

            System.out.println("No driver selected");
        }

        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        return driver;
    }


}
