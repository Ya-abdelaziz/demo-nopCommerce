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

    @When("^user login with \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")
      public void EnterValidEmailAndPassword( String type,String email, String password)
        { login.enterEmail().sendKeys(email);
          login.enterPassword().sendKeys(password); }

    @And("user press on login button")
      public void clickOnLogin()
        { login.pressLoginButton(); }

   @Then("user login to the system successfully")
     public void loginToSystemSuccessfully()
       { login.URL();
         login.myAccountTab();}


    @Then("user could not login to the system")
    public void loginUnsuccessfully()
    { softAssert.assertTrue(login.errorMessage().getText().contains("Login was unsuccessful"));

        login.errorColor();
    }

}
