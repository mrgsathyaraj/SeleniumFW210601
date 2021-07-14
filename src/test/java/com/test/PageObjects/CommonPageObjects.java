package com.test.PageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonPageObjects {

    public WebDriver driver;

    
    By oAllCategories = By.xpath("//select[@id='searchDropdownBox']");
    boolean categoryPresent = false;
    By headerLogo = By.id("nav-logo-sprites");
    By LanguagePageNavHover= By.xpath("//span[@class='icp-nav-link-inner']");
    By navgloballocationpopoverlink=By.id("nav-global-location-popover-link");
    By navlinkaccountList = By.id("nav-link-accountList");
    By navorders = By.id("nav-orders");
    By navcart =  By.id("nav-cart");
    By navhamburgermenu = By.id("nav-hamburger-menu");
    By navxshopcontainer =  By.xpath("//*[@id='nav-xshop-container']/div/a");



    public boolean AllCategories(List<String> allitems)
    {
        Select s = new Select(driver.findElement(oAllCategories));
        List<WebElement> getAllCategories=s.getOptions();


        for(int i = 0; i<allitems.size();i++)

        {

          String getActualItems= getAllCategories.get(i).getText();
          String getExpectedItems = allitems.get(i);

            if(getActualItems.contains(getExpectedItems))
            {
                   categoryPresent=true;
            }
            else
             {
                System.out.println("The expected value not present in  the allcategories : "+getAllCategories.get(i));
                categoryPresent=false;
            }
        }
        return categoryPresent;
    }

    public boolean AllCategoriesResult()
    {
        if(categoryPresent=true)
        {
            return categoryPresent;
        }
        else
        {
            return categoryPresent;
        }

    }

    public void SelectTheItemsfromAllCategories(String category)
    {
        Select select = new Select(driver.findElement(oAllCategories));
        select.selectByVisibleText(category);
    }

    public void HomePageLogoVerification()
    {
        Boolean H= driver.findElement(headerLogo).isDisplayed();
        Assert.assertEquals(true,H);
    }

    public void LanguageHovertoSelectLanguage(String Language)
    {

        Actions action = new Actions(driver);
        WebElement vLanguageHover= driver.findElement(LanguagePageNavHover);
        action.moveToElement(vLanguageHover).perform();
        driver.findElement(By.xpath("//*[contains(text(),'"+Language+"')]")).click();

        }

        public void AccountandListLinkVerification()
        {
            Boolean AL= driver.findElement(navlinkaccountList).isDisplayed();
            Assert.assertEquals(true,AL);
        }

    public void ReturnandOrdersLinkVerification()
    {
        Boolean Order= driver.findElement(navorders).isDisplayed();
        Assert.assertEquals(true,Order);
    }

    public void CartLinkVerification()
    {
        Boolean Cart= driver.findElement(navcart).isDisplayed();
        Assert.assertEquals(true,Cart);
    }

    public void GeoLocationLinkVerify()
    {
        Boolean GeoLocationLink= driver.findElement(navgloballocationpopoverlink).isDisplayed();
        Assert.assertEquals(true,GeoLocationLink);

    }

    public void HamburgMenuValidation()
    {
        driver.findElement(navhamburgermenu).click();

        String SigninText = driver.findElement(By.xpath("//*[@id='hmenu-customer-name']/b")).getText();

    }

    public void ProgressiveMenuVerification(List<String> ProgMenu)
    {

         List<WebElement> NavshopxContainer = driver.findElements(navxshopcontainer);

         Set<String> nList = new HashSet<>();

         NavshopxContainer.get(0).getText();
         int ProgMenuSize = NavshopxContainer.size();


         for(int i=0;i<ProgMenu.size();i++)
         {

            String ExpectedProgMenu = ProgMenu.get(i);

             for(WebElement S:NavshopxContainer)
             {
                 if(ExpectedProgMenu.contains(S.getText()))
                 {
                     System.out.println("true");
                     nList.add(ExpectedProgMenu);

                 }
                 else
                 {
                     System.out.println("false");
                 }

             }


         }

         if(nList.equals(ProgMenu))
         {
             System.out.println("Progressive Menu bar worked");
         }
         else
         {
             System.out.println("check error");
         }
    }

        public CommonPageObjects(WebDriver driver)
    {
        this.driver=driver;
    }


}

  /*  // Language validation -This needs to be worked later
    public void VerifyActiveLanguagebyHover(String Language)
    {
        Actions action = new Actions(driver);
        WebElement vLanguageHover= driver.findElement(LanguagePageNavHover);
        action.moveToElement(vLanguageHover).perform();
        WebElement GetActiveSelectionLang = driver.findElement(VerifyLanguageActive);
        String ActualLang= GetActiveSelectionLang.getAttribute("outerHTML");
        Assert.assertEquals(Language,ActualLang);

    }
*/