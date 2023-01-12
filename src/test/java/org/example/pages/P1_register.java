package org.example.pages;

import org.example.stepdefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P1_register {

    public WebElement resgisterlink() {

        WebElement x = Hooks.driver.findElement(By.className("ico-register"));
        return x;
    }

    public WebElement user_gender() {
        //WebElement g=null;
        WebElement g = Hooks.driver.findElement(By.cssSelector("span > input[type=\"radio\"]"));
        return g;
    }
   public WebElement f_name()
   {
       WebElement f =Hooks.driver.findElement(By.id("FirstName"));
       return f;
   }
    public WebElement l_name()
    {
        WebElement l =Hooks.driver.findElement(By.id("LastName"));
        return l;
    }
    public WebElement user_email()
    {
        WebElement e =Hooks.driver.findElement(By.id("Email"));
        return e;
    }
    public WebElement day() {

        WebElement choosenday = Hooks.driver.findElement(By.name("DateOfBirthDay"));

      return choosenday;
    }
    public WebElement month() {

       WebElement monthh =Hooks.driver.findElement(By.name("DateOfBirthMonth"));
       return monthh;
    }
    public WebElement year() {

        WebElement choosenyear = Hooks.driver.findElement(By.name("DateOfBirthYear"));
        return choosenyear;
    }
    public WebElement company_name()
    {
     WebElement cn =Hooks.driver.findElement(By.id("Company"));
     return cn;
    }
    public WebElement user_password()
    {
        WebElement p=Hooks.driver.findElement(By.id("Password"));
         return p;
    }

    public WebElement confirm_password()
    {
        WebElement cp=Hooks.driver.findElement(By.id("ConfirmPassword"));
        return cp;
    }
    public WebElement register_btn() {

        WebElement reg_btn = Hooks.driver.findElement(By.id("register-button"));
        return reg_btn;
    }
    public WebElement success_message()
    {
        WebElement msg =Hooks.driver.findElement(By.className("result"));
        return msg;
    }
    public WebElement continue_btn()
    {
        WebElement cont_btn = Hooks.driver.findElement(By.cssSelector("div > a[class=\"button-1 register-continue-button\"]"));
        return cont_btn;
    }


}
