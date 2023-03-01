package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class P03_homePage {

    public void selectEuro() {
        Select select = new Select(Hooks.driver.findElement(By.id("customerCurrency")));
        select.selectByVisibleText("Euro");
        //  return Hooks.driver.findElement(By.id("customerCurrency"));
    }

    public void verifyEuroSign() {
        List<WebElement> euroSign = Hooks.driver.findElements(By.xpath("//*[@class='price actual-price']"));
        int size = euroSign.size();

        //  System.out.println(size);
        //  System.out.println(euroSign);

        for (int i = 0; i < size; i++) {
            String sign = euroSign.get(i).getText();

            //  System.out.println(sign);

            Assert.assertTrue(sign.contains("€"));

        }


    }


}
