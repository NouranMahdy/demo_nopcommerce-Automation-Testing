package org.example.pages;

import io.cucumber.messages.types.Hook;
import org.example.stepdefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
public class P3_currencies {


    public WebElement currency_list()
    {
        return Hooks.driver.findElement(By.name("customerCurrency"));

    }
    public List<WebElement> productprices()
    {
        return Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));

    }

}
