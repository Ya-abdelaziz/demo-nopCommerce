package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class P01_register {

    SoftAssert softAssert = new SoftAssert();

    public WebElement registerLink() {
        return Hooks.driver.findElement(By.className("ico-register"));
    }

    public WebElement femaleGender() {
        return Hooks.driver.findElement(By.id("gender-female"));
    }

    public WebElement firstName(String FirstName) {
        Hooks.driver.findElement(By.id("FirstName")).sendKeys(FirstName);
        return Hooks.driver.findElement(By.id("FirstName"));
    }

    public WebElement lastName(String LastName) {
        Hooks.driver.findElement(By.id("LastName")).sendKeys(LastName);
        return Hooks.driver.findElement(By.id("LastName"));
    }

    public WebElement enterDay(int Day) {
        Select select = new Select(Hooks.driver.findElement(By.name("DateOfBirthDay")));
        select.selectByIndex(Day);
        return Hooks.driver.findElement(By.name("DateOfBirthDay"));
    }

    public WebElement enterMonth(int Month) {
        Select select = new Select(Hooks.driver.findElement(By.name("DateOfBirthMonth")));
        select.selectByIndex(Month);
        return Hooks.driver.findElement(By.name("DateOfBirthMonth"));
    }

    public WebElement enterYear(int Year) {
        Select select = new Select(Hooks.driver.findElement(By.name("DateOfBirthYear")));
        select.selectByIndex(Year);
        return Hooks.driver.findElement(By.name("DateOfBirthYear"));
    }

    public void enterEmail(String Email) {
        Hooks.driver.findElement(By.id("Email")).sendKeys(Email);
    }

    public WebElement enterPassword(String Password) {
        Hooks.driver.findElement(By.id("Password")).sendKeys(Password);
        return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement enterConfirmPassword(String rePassword) {
        Hooks.driver.findElement(By.id("ConfirmPassword")).sendKeys(rePassword);
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }

    public WebElement clickOnRegister() {
        return Hooks.driver.findElement(By.id("register-button"));
    }

    public void successMessage() {
       Boolean message =  Hooks.driver.findElement(By.className("result")).getText().contains("Your registration completed");
         softAssert.assertTrue(message);
    }

    public void ColorOfSuccessMessage() {
        String colorRbg = Hooks.driver.findElement
                        (By.className("result"))
                .getCssValue("color");
        String colorHEX = Color.fromString(colorRbg).asHex();
        softAssert.assertEquals(colorHEX, "#4cb17c");
    }



}
