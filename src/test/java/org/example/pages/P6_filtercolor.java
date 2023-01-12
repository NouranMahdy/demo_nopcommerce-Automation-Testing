package org.example.pages;

import org.example.stepdefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P6_filtercolor {


    public WebElement apperal()
    {
        return Hooks.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/apparel\"]"));
    }
    public WebElement shoes()
    {
        return Hooks.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/shoes\"]"));
    }
    public WebElement choosencolor()
    {
        return Hooks.driver.findElement(By.id("attribute-option-14"));
    }
}
