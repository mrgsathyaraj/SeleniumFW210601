package com.test.StepDef;

import com.test.Core.TestContext;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.jv.Lan;
import org.junit.Assert;

import java.util.List;

public class HeaderValidation {

    TestContext testContext;

    public HeaderValidation(TestContext testContext)
    {
        this.testContext = testContext;
    }


    @When("User selected the All Categories Dropdown for Verify")
    public void user_selected_the_all_categories_dropdown_for_verify(List<String> arg) {

        testContext.CommonPageObjects.AllCategories(arg);
    }


    @Then("All CategoriesDropdown Validated successfully")
    public void all_categories_dropdown_validated_successfully() {

        boolean expected =true;
        Assert.assertEquals(expected,testContext.CommonPageObjects.AllCategoriesResult());

        }


    @Given("User Selected the value in All Categories as {string}")
    public void user_selected_the_value_in_all_categories_as(String productItem) {

        testContext.CommonPageObjects.SelectTheItemsfromAllCategories(productItem);

    }

    @Given("User verified the Amazon Logo")
    public void user_verified_the_amazon_logo() {
        testContext.CommonPageObjects.HomePageLogoVerification();
     }




     @Given("Hamburger Menu Validated")
    public void hamburger_menu_validated() {

        testContext.CommonPageObjects.HamburgMenuValidation();


    }

    @Given("Select the Language from Menu Bar {string}")
    public void select_the_language_from_menu_bar(String Language) {
        testContext.CommonPageObjects.LanguageHovertoSelectLanguage(Language);

         }


    @Given("Progressive Menu Validated")
    public void progressive_menu_validated(List<String> ProgMenu) {

        testContext.CommonPageObjects.ProgressiveMenuVerification(ProgMenu);
         }
    @Given("Verify the GeoLocationSelection Link")
    public void verify_the_geo_location_selection_link() {

        testContext.CommonPageObjects.GeoLocationLinkVerify();

    }

    @Given("Verify the List and Accounts Link")
    public void verify_the_list_and_accounts_link() {

        testContext.CommonPageObjects.AccountandListLinkVerification();

          }

    @Given("verify the Return and Orders Link")
    public void verify_the_return_and_orders_link() {

        testContext.CommonPageObjects.ReturnandOrdersLinkVerification();

         }

    @Given("Verify the Cart Link")
    public void verify_the_cart_link() {

        testContext.CommonPageObjects.CartLinkVerification();

         }


}
