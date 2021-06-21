package com.test.PageObjects;

import io.cucumber.java.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainSearchPageObjects {

    WebDriver driver;
    Scenario scn;

    By searchboxtext = By.id("twotabsearchtextbox");
    By searchbutton = By.id("nav-search-submit-button");

    public MainSearchPageObjects(WebDriver driver) {
        this.driver=driver;
    }

    public void searchPage(String searchword)
    {
        driver.findElement(searchboxtext).sendKeys(searchword);
        driver.findElement(searchbutton).submit();

    }

    public void autoSearch(String autosearchword)
    {

    }

}
