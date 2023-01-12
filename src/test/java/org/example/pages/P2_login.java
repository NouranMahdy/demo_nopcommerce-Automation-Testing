package org.example.pages;

import org.example.stepdefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P2_login {


    public WebElement link_login()
    {
        WebElement link= Hooks.driver.findElement(By.className("ico-login"));
        return link;
    }
    public WebElement valid_email()
    {
       return Hooks.driver.findElement(By.id("Email"));

    }
    public WebElement valid_password()
    {
      return Hooks.driver.findElement(By.id("Password"));

    }
    public void login_info(String email, String password)
    {
        valid_email().sendKeys(email);
        valid_password().sendKeys(password);
    }


    public WebElement login_btn()
    {
        WebElement btn_login= Hooks.driver.findElement(By.cssSelector("div > button[type=\"submit\"]"));
        return btn_login;
    }
    public WebElement myaccount()
    {
        return Hooks.driver.findElement(By.className("ico-account"));
    }
    public WebElement invalidemail()
    {
        return Hooks.driver.findElement(By.id("Email"));

    }
    public WebElement invalidpassword()
    {
        return Hooks.driver.findElement(By.id("Password"));

    }
    public WebElement unsuccessfull_message()
    {
        return Hooks.driver.findElement(By.className("message-error"));

    }

}
