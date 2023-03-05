package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;

public class P06_followUS {

    public void openFacebook() {
        Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]")).click();

        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        System.out.println(tabs.size());

        Hooks.driver.switchTo().window(tabs.get(1));
        System.out.println("tab 1:  " + Hooks.driver.getCurrentUrl());
        tabs = new ArrayList<>(Hooks.driver.getWindowHandles());


    }

    public void openTwitter()  {
        Hooks.driver.findElement(By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]")).click();

        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(6));
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));

        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        System.out.println(tabs.size());

        Hooks.driver.switchTo().window(tabs.get(1));
        System.out.println("tab 2:  " + Hooks.driver.getCurrentUrl());

        tabs = new ArrayList<>(Hooks.driver.getWindowHandles());

    }
/*
    public void openRss()  {
        Hooks.driver.findElement(By.cssSelector("a[href=\"/news/rss/1\"]")).click();

        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(6));
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));

        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        System.out.println(tabs.size());

        Hooks.driver.switchTo().window(tabs.get(1));
        System.out.println("tab 3:  " + Hooks.driver.getCurrentUrl());

        tabs = new ArrayList<>(Hooks.driver.getWindowHandles());

    }

    public void openYoutube()  {
        Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]")).click();

        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(6));
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));

        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        System.out.println(tabs.size());

        Hooks.driver.switchTo().window(tabs.get(1));
        System.out.println("tab 4:  " + Hooks.driver.getCurrentUrl());

        tabs = new ArrayList<>(Hooks.driver.getWindowHandles());

    }

 */

}
