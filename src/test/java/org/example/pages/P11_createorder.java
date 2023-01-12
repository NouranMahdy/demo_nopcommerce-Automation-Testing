package org.example.pages;

import io.cucumber.messages.types.Hook;
import org.example.stepdefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P11_createorder {

    public WebElement shoppingcartbutton()
    {
        return Hooks.driver.findElement(By.className("ico-cart"));
    }
    public WebElement termsofservice()
    {
        return Hooks.driver.findElement(By.id("termsofservice"));
    }
    public  WebElement checkoutbutton()
    {
        return Hooks.driver.findElement(By.id("checkout"));
    }


    public WebElement country()
    {
        return Hooks.driver.findElement(By.name("BillingNewAddress.CountryId"));
    }
    public WebElement city()
    {
        return Hooks.driver.findElement(By.id("BillingNewAddress_City"));
    }
    public WebElement address()
    {
        return Hooks.driver.findElement(By.id("BillingNewAddress_Address1"));
    }
    public WebElement postalcode()
    {
        return Hooks.driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
    }
    public WebElement phone()
   {
        return Hooks.driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
    }
    public WebElement fax()
    {
        return Hooks.driver.findElement(By.id("BillingNewAddress_FaxNumber"));
    }
    public WebElement continueorderbutton()
    {
        return Hooks.driver.findElement(By.name("save"));
    }
    public WebElement shippingaddress()
    {
        return Hooks.driver.findElement(By.cssSelector("div>button[class=\"button-1 shipping-method-next-step-button\"]"));
    }
   public WebElement paymentmethod()
   {
       return  Hooks.driver.findElement(By.cssSelector("div>button[class=\"button-1 payment-method-next-step-button\"]"));
    }
    public WebElement paymentinfo()
    {
        return  Hooks.driver.findElement(By.cssSelector("div>button[class=\"button-1 payment-info-next-step-button\"]"));
    }
    public WebElement confirmorder()
    {
        return Hooks.driver.findElement(By.cssSelector("div>button[class=\"button-1 confirm-order-next-step-button\"]"));
    }
    public WebElement confirmmsg()
    {
        return Hooks.driver.findElement(By.cssSelector("[class=\"section order-completed\"] div[class=\"title\"]"));
    }

}
