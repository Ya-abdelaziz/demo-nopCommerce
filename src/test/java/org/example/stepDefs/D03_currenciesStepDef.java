package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
public class D03_currenciesStepDef {
    P03_homePage homePage = new P03_homePage();

    @Given("User go to home page")
    public void GoToHomePage()
      { homePage.HomePage(); }

    @When("User chooses Euro currency")
    public void chooseEuro()
      {homePage.selectEuro(); }

    @Then("verify that the euro currency was appeared")
    public void verifyEuroAppearance()
      {  }
}
