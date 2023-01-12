package org.example.pages;

import org.example.stepdefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.webaudio.WebAudio;

public class P10_comparelist {

    public WebElement product1()
    {
        return Hooks.driver.findElement(By.cssSelector("div[data-productid=\"18\"]>div>div>div[class=\"buttons\"]>button[title=\"Add to compare list\"]"));
    }
    public WebElement product2()
    {
        return Hooks.driver.findElement(By.cssSelector("div[data-productid=\"43\"]>div>div>div[class=\"buttons\"]>button[title=\"Add to compare list\"]"));
    }
    public WebElement successmessagec()
    {
        return Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]"));
    }
    public WebElement successmessagecolorc()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }
    public WebElement confirmproductincompare()
    {
        return Hooks.driver.findElement(By.cssSelector("tr[class=\"product-name\"]"));
    }
}
