package com.eBay.step_definitions;

import com.eBay.pages.SearchVerifyPage;
import com.eBay.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.ArrayList;
import java.util.Collections;

import static junit.framework.TestCase.assertEquals;

public class SearchDefinitions {

    SearchVerifyPage searchVerifyPage = new SearchVerifyPage();


    @And("I navigate to www.ebay.co.uk")
    public void i_navigate_to_www_ebay_co_uk() {
        //searchVerifyPage.acceptCookies.click();
        Driver.getDriver().get("https://www.ebay.co.uk");
    }

    @Given("I am a non-registered customer")
    public void i_am_a_non_registered_customer() {
        searchVerifyPage.notRegistered.isDisplayed();
    }

    @When("I search for an {string}")
    public void i_Search_For_An(String string) {
        searchVerifyPage.searchItem.sendKeys(string  + Keys.ENTER);
        //Assert.assertTrue(searchVerifyPage.searchItem.equals(string));

    }
    @Then("I get a list of matching results")
    public void i_get_a_list_of_matching_results() {
        Assert.assertTrue(searchVerifyPage.matchingResults.isDisplayed());
        //Assert.assertTrue(searchVerifyPage.searchItem.getText().contains(string));
//        String actualResult = getTitle();
//        String expectedResult = "results for iphone";
//        assertEquals(expectedResult, actualResult);

    }

    @Then("the resulting items cards show: postage price, No of bids, price or show BuyItNow tag")
    public void the_resulting_items_cards_show_postage_price_no_of_bids_price_or_show_buy_it_now_tag() {
        searchVerifyPage.postagePrice.isDisplayed();
        searchVerifyPage.noOfBids.isDisplayed();
        searchVerifyPage.price.isDisplayed();
    }
    @When("I sort the results by Lowest Price")
    public void i_sort_the_results_by_lowest_price() {
        searchVerifyPage.dropdownBox.click();
        searchVerifyPage.lowestPrice.click();
    }
    @Then("the results are listed in ascending order")
    public void the_results_are_listed_in_the_page_in_ascending_order() {
    }

    @When("I sort the results by Highest Price")
    public void i_sort_the_results_by_highest_price() {
        searchVerifyPage.dropdownBox.click();
        searchVerifyPage.highestPrice.click();

    }
    @Then("the results are listed in descending order")
    public void the_results_are_listed_in_descending_order() {

    }

    @Then("the results show more than one page")
    public void the_results_show_more_than_one_page() {
        searchVerifyPage.moreThenOnePage.isDisplayed();
    }

    @Then("the user can navigate through the pages to continue looking at the items")
    public void the_user_can_navigate_through_the_pages_to_continue_looking_at_the_items() {
        searchVerifyPage.nextPage.click();
    }



}
