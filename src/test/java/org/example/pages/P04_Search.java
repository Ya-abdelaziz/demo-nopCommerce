package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class P04_Search {
    SoftAssert softAssert = new SoftAssert();
    public void currentUrl() {
         Hooks.driver.navigate().to("https://demo.nopcommerce.com/search?q=");

        softAssert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/search?q=");
        softAssert.assertAll();
    }

    public WebElement searchBar() {

     return Hooks.driver.findElement(By.id("small-searchterms"));
    }
    public void searchButton() {
       Hooks.driver.findElement(By.xpath("//*[@class='button-1 search-box-button']")).click();
    }

    public void NumOfResults()
    {
      List<WebElement> numOfResults = Hooks.driver.findElements(By.className("product-title"));

      int size = numOfResults.size();
        System.out.println(size);

    }



}
