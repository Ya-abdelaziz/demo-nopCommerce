package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P03_homePage {

    public void HomePage()
      {
         Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
      }

    public void selectEuro()
      {
          Select select = new Select(Hooks.driver.findElement(By.id("customerCurrency")));
         select.selectByVisibleText("Euro");
       //  return Hooks.driver.findElement(By.id("customerCurrency"));
      }




}
