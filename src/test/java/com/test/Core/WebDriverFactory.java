package com.test.Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverFactory {

    private static WebDriver driver = null;

    public static WebDriver GetBrowserConnection(String browser)
    {
        if ("chrome".equals(browser)) {
            driver = new ChromeDriver();
        }
        else{

            System.out.println("No driver selected");
        }

        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        return driver;
    }

    public static String browserName(String browser)
    {
        return browser;
    }

}
