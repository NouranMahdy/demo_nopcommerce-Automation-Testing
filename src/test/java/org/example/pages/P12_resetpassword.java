package org.example.pages;

import org.example.stepdefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.xml.ws.wsaddressing.W3CEndpointReference;

public class P12_resetpassword {


    public WebElement forgetpassword()
    {
        return Hooks.driver.findElement(By.cssSelector("span > a[href=\"/passwordrecovery\"]"));
    }
public WebElement resetbutton()
{
    return Hooks.driver.findElement(By.name("send-email"));
}
public WebElement resetmessage()
{
    return Hooks.driver.findElement(By.cssSelector("div > p[class=\"content\"]"));
}
}
