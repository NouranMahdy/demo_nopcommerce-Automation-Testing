package org.example.pages;


import io.cucumber.messages.types.Hook;
import org.example.stepdefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P5_hovercategories {

    public List<WebElement> main_category() {

        return Hooks.driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>a[href]"));

    }
    public WebElement categoryname(){

        return Hooks.driver.findElement(By.cssSelector("[itemprop=\"itemListElement\"]"));
    }

    public WebElement subcategoryname() {

        return Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"]"));
    }
}
