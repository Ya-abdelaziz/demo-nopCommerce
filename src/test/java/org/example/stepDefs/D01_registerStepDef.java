package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class D01_registerStepDef {
    P01_register register = new P01_register();

    @Given("user go to register page")
    public void goRegisterPage()
      { register.registerLink().click(); }

      @And("user select gender type")
      public void clickOnFemaleGender()
         { register.femaleGender().click(); }

      @And("user enter first name \"automation\" and last name \"tester\"")
      public void enterFirstNameAndLastName()
        {    register.firstName("automation");
             register.lastName("tester");   }

      @And("user enter date of birth")
      public void enterDateOfBrith()
        {  register.enterDay(5);
           register.enterMonth(7);
           register.enterYear(27);}

      @And("user enter email \"test@example.com\" field")
      public void userEnterEmail()
      { register.enterEmail("test222@example.com"); }
}
