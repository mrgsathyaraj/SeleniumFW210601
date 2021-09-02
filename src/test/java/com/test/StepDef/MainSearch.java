package com.test.StepDef;

import com.test.Core.TestContext;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.junit.Test;

@Log4j2
public class MainSearch{

    TestContext testContext;
    Scenario scn;
    String productItem;

    public MainSearch(TestContext testContext)
    {
        this.testContext= testContext;
        scn = testContext.scn;
    }

    @When("User Searched the Product {string}")
    public void user_searched_the_product(String productItem) {
        this.productItem =productItem;
        testContext.mainsearchpageobjects.searchPage(productItem);
        scn.log("HELLO THERE!!! ");
        log.info("HELLO THERE!!! ");
    }

    @Then("Search Results will be displayed")
    public void search_results_will_be_displayed() {

    String Expected = "Amazon.in : "+productItem;
    String Actual = testContext.driver.getTitle();
    Assert.assertEquals(Expected,Actual);
        scn.log("HELLO THERE!!! ");
        log.info("HELLO THERE!!! ");


    }

 }
