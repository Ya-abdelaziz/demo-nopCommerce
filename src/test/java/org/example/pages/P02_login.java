package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.support.Color;

import java.awt.*;

public class P02_login {

    SoftAssert softAssert = new SoftAssert();
    public void clickOnLoginButton()
       {  Hooks.driver.findElement(By.className("ico-login")).click();}

    public WebElement enterEmail()
        { return Hooks.driver.findElement(By.id("Email")); }

    public WebElement enterPassword()
        { return Hooks.driver.findElement(By.id("Password")); }

    public void pressLoginButton()
        { Hooks.driver.findElement(By.cssSelector("button[class='button-1 login-button']")).click(); }

    public void URL()
        {  String url = Hooks.driver.getCurrentUrl();
           softAssert.assertEquals(url,"https://demo.nopcommerce.com/");
           softAssert.assertAll(); }

    public void myAccountTab()
        {  Boolean myAccount = Hooks.driver.findElement(By.className("ico-account")).isDisplayed();
           softAssert.assertTrue(myAccount);
            softAssert.assertAll(); }

    public WebElement errorMessage()
        {  return Hooks.driver.findElement(By.cssSelector("div[class='message-error validation-summary-errors']")); }

    public void errorColor()
        { String colorRBG = Hooks.driver.findElement
                            (By.cssSelector("div[class='message-error validation-summary-errors']"))
                            .getCssValue("color");
            String colorHex = Color.fromString(colorRBG).asHex();
            softAssert.assertEquals(colorHex,"#e4434b");
            softAssert.assertAll();
        }


}