package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P06_followUS;
import org.testng.Assert;

import java.util.WeakHashMap;

public class D06_followUsStepDef {
    P06_followUS followUS = new P06_followUS();

    @When("user opens facebook link")
    public void OpenFacebook() {
        followUS.openFacebook();
    }

    @Then("^\"([^\"]*)\" is opened in new tab$")
    public void verifyFacebookLink(String URL) {
        Assert.assertEquals(URL, Hooks.driver.getCurrentUrl());
    }


    @When("user opens twitter link")
    public void OpenTwitter()  {
        followUS.openTwitter();
    }

    @Then("^\"([^\"]*)\" is opened in new tab2$")
    public void verifyTwitterLink(String URL2)
    {
        Assert.assertEquals(URL2,Hooks.driver.getCurrentUrl());
    }

}