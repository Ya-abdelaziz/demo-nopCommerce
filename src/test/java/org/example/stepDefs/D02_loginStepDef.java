package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {

    SoftAssert softAssert = new SoftAssert();
    P02_login login = new P02_login();

    @Given("user go to login page")
      public void clickLogin()
       { login.clickOnLoginButton(); }

    @When("user login with \"valid\" email \"test@example.com\" and password \"P@ssw0rd\"")
      public void EnterValidEmailAndPassword()
        { login.enterEmail().sendKeys("test@example.com");
          login.enterPassword().sendKeys("P@ssw0rd"); }

    @And("user press on login button")
      public void clickOnLogin()
        { login.pressLoginButton(); }

   @Then("user login to the system successfully")
     public void loginToSystemSuccessfully()
       { login.URL();
         login.myAccountTab();}

    @When("user login with \"invalid\" email \"wrong@example.com\" and password \"P@ssw0rd\"")
    public void EnterInValidEmailAndPassword()
    { login.enterEmail().sendKeys("wrong@example.com");
        login.enterPassword().sendKeys("P@ssw0rd"); }


    @Then("user could not login to the system")
    public void loginUnsuccessfully()
    { softAssert.assertTrue(login.errorMessage().getText().contains("Login was unsuccessful"));

        login.errorColor();
    }

}
