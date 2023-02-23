package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class P01_register {
    WebElement element = new WebDriverWait(Hooks.driver, Duration.ofSeconds(40))
            .until(ExpectedConditions.presenceOfElementLocated(By.id("gender-female")));
    public WebElement registerLink()
    { return Hooks.driver.findElement(By.className("ico-register")); }

    public WebElement femaleGender()
    { return Hooks.driver.findElement(By.id("gender-female")); }

    public WebElement firstName(String FirstName) {
         Hooks.driver.findElement(By.id("FirstName")).sendKeys(FirstName);
           return Hooks.driver.findElement(By.id("FirstName")); }

    public WebElement lastName(String LastName){
         Hooks.driver.findElement(By.id("LastName")).sendKeys(LastName);
           return Hooks.driver.findElement(By.id("LastName"));}

    public WebElement enterDay(int Day)
     {   Select select = new Select(Hooks.driver.findElement(By.name("DateOfBirthDay")));
         select.selectByIndex(Day);
           return Hooks.driver.findElement(By.name("DateOfBirthDay"));}
    public WebElement enterMonth(int Month)
     {   Select select = new Select(Hooks.driver.findElement(By.name("DateOfBirthMonth")));
         select.selectByIndex(Month);
           return Hooks.driver.findElement(By.name("DateOfBirthMonth")); }

    public WebElement enterYear(int Year)
     {  Select select = new Select(Hooks.driver.findElement(By.name("DateOfBirthYear")));
        select.selectByIndex(Year);
          return Hooks.driver.findElement(By.name("DateOfBirthYear")); }

    public void enterEmail(String Email)
    {
      Hooks.driver.findElement(By.id("Email")).sendKeys(Email);
    }
}
