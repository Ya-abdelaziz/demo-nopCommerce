package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P05_hoverCategories;

public class D05_hoverCategoriesStepDef {

    P05_hoverCategories hoverCategories = new P05_hoverCategories();

    @When("User selects random one of the three main categories and hover on it")
   public void SelectRandomMainCategory()
   {
       hoverCategories.selectRandomMainCategory();
   }

   @And("User selects random one of the three sub categories and click on it")
    public void SelectRandomSubCategory()
   {
     hoverCategories.selectRandomSubCategory();
   }

   @And("User gets text of the page title")
    public void PageTitle()
   {
    hoverCategories.pageTitle();
   }

   @Then("verify")
    public void ireqa()
   {

   }





}
