package org.example.pages;

import org.example.stepdefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P9_wishlist {


    public WebElement productwishlist()
    {

     //   return Hooks.driver.findElement(By.cssSelector("div[data-productid=\"43\"]>div>div>div[class=\"buttons\"]>button[title=\"Add to wishlist\"]"));
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]"));
    }
    public WebElement successmessagew()
    {
        return Hooks.driver.findElement(By.className("content"));
        //return Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]"));
    }
    public WebElement successmessagecolorw()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }
    public WebElement wishlisticon()
    {
        return Hooks.driver.findElement(By.className("wishlist-label"));
        //ico-wishlist
    }
   // public WebElement foundproductinwishlist()
    //{
       // return Hooks.driver.findElement(By.className("qty-input"));
      //  return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[1]/table/tbody/tr/td[6]/input"));
    //}
public WebElement productfoundinwishlist()
{
   return Hooks.driver.findElement(By.cssSelector("th[class=\"unit-price\"]"));
}

}
