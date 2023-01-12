package org.example.pages;

import io.cucumber.messages.types.Hook;
import org.example.stepdefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P8_addtocart {


    public WebElement bookcategory()
    {
        return Hooks.driver.findElement(By.cssSelector("li>a[href=\"/books\"]"));
    }

    public WebElement bookaddcart()
    {
        return Hooks.driver.findElement(By.cssSelector("div > button[class=\"button-2 product-box-add-to-cart-button\"]"));
    }

       public WebElement itemfound()
    {
        return Hooks.driver.findElement(By.cssSelector("th[class=\"product\"]"));
      }
    public WebElement successmessage()
    {
        return Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]"));
    }
    public WebElement successmessagecolor()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }
}
