package org.example.pages;

import io.cucumber.messages.types.Hook;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.example.stepDefs.Hooks.driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class P05_hoverCategories {
    Actions actions = new Actions(driver);
    public void selectRandomMainCategory() {

      List<WebElement> selectRandomMainCategory = driver
              .findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/li"));
      int count = selectRandomMainCategory.size();
      System.out.println(count);

   int min = 0, max= count-1, range= max-min+1;
     int selectedCategory = (int) Math.floor(Math.random() * range + min);
   actions.moveToElement(selectRandomMainCategory.get(selectedCategory)).perform();
      String selectedCategoryText = selectRandomMainCategory.get(selectedCategory).getText();
      System.out.println("to know which category is selected: " + selectedCategoryText);
  }

    public void selectRandomSubCategory()
    {

        List<WebElement> selectRandomMainCategory = driver
                .findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/li"));
        int count = selectRandomMainCategory.size();
        int min = 0, max= count-1, range= max-min+1;
        int selectedCategory = (int) Math.floor(Math.random() * range + min);
        actions.moveToElement(selectRandomMainCategory.get(selectedCategory)).perform();

        selectedCategory = selectedCategory + 1;
        String locator = "(//ul[@class='top-menu notmobile']//ul)[" + selectedCategory + "]/li";
        List<WebElement> subCategories = driver.findElements(By.xpath(locator));

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        String selectedSubCategoryText,selectedMainCategoryText;
        if (!subCategories.isEmpty()) {
            int subCategoryCount = subCategories.size();
            int LValue = 0, UValue = subCategoryCount-1, NRange= UValue-LValue+1;

            System.out.println("sub Categories " + subCategoryCount);
            System.out.println(subCategories.get(0).getText());
            System.out.println(subCategories.get(1).getText());
            System.out.println(subCategories.get(2).getText());
            int selectedSubCategory = (int) Math.floor(Math.random() * (NRange) + LValue);
            selectedSubCategoryText = subCategories.get(selectedSubCategory).getText().toLowerCase().trim();
            System.out.println(selectedSubCategory);

            subCategories.get(selectedSubCategory).click();

            String page_title =Hooks.driver.findElement(By.className("page-title")).getText().toLowerCase().trim();
            Assert.assertEquals(page_title, selectedSubCategoryText );
        }
        else
        {
           // selectedMainCategoryText = subCategories.get(selectedCategory-1).getText().toLowerCase().trim();
            selectedCategory= selectedCategory-1;
            String selectedCategoryText = selectRandomMainCategory.get(selectedCategory).getText().toLowerCase().trim();
            selectRandomMainCategory.get(selectedCategory).click();

            String page_title =Hooks.driver.findElement(By.className("page-title")).getText().toLowerCase().trim();
            Assert.assertEquals(page_title, selectedCategoryText );
        }


    }

    public void pageTitle()
    {
        String page_title =Hooks.driver.findElement(By.className("page-title")).getText();
        System.out.println("The Page Title Is:  " + page_title);
    }




}
