package com.test.StepDef;

import com.test.Core.TestContext;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;

public class MainSearch {

    TestContext testContext;
    Scenario scn;

    public MainSearch(TestContext testContext)
    {
        this.testContext= testContext;
        scn = testContext.scn;
    }

    @When("User Searched the Product {string}")
    public void user_searched_the_product(String string) {

        testContext.mainsearchpageobjects.searchPage(string);
    }

    @Then("Search Results will be displayed")
    public void search_results_will_be_displayed() {

    String Expected = "Amazon.in : Mobile";
    String Actual = testContext.driver.getTitle();
    Assert.assertEquals(Expected,Actual);

    }

}
