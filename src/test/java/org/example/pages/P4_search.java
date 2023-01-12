package org.example.pages;

import org.example.stepdefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P4_search {

    public WebElement searchfield()
    {
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }
     public WebElement search_button()
     {
        // return Hooks.driver.findElement(By.cssSelector("button[type=\"submit\"]"));
         return Hooks.driver.findElement(By.cssSelector("button[type=\"submit\"]"));
     }
     public List <WebElement> searchlist()
     {

         return Hooks.driver.findElements(By.className("page-title"));
     }

     public WebElement clickedproduct()
     {
         return Hooks.driver.findElement(By.className("picture"));
     }
     public WebElement productsku()
     {
         return Hooks.driver.findElement(By.className("sku"));
     }

}
