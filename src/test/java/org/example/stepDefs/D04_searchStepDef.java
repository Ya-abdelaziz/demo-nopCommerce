package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P04_Search;
import org.openqa.selenium.WebElement;

public class D04_searchStepDef {
    P04_Search search = new P04_Search();

    @Given("user go to home page")
    public void homePage()
    {
        search.currentUrl();
    }

    @When("^user enters (.*)$")
    public void searchbar(String data)
    {
        search.searchBar().sendKeys(data);
    }

    @And("user clicks on search button")
    public void clickSearch()
    {
        search.searchButton();
    }

    @Then("searching By product name should be successful")
    public void searchByProductName()
    {
        search.NumOfResults();
        search.searchSuccessText();

    }

    @Then("searching By Sku should be successful")
    public void searchBySku()
    {
      search.NumOfResults();
      search.clickOnProduct().click();
      search.getSku();
    }





}
