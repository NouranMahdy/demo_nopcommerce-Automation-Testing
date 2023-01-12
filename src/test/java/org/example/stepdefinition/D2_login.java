package org.example.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P2_login;
import org.example.pages.P1_register;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class D2_login {

    P2_login obj_p2login =new P2_login();
    @Given("user go to login page")
    public void login_link()
    {

        obj_p2login.link_login().click();
    }

    @When("user enter Valid email")
    public void validemail()
    {
     obj_p2login.valid_email().sendKeys(Hooks.EMAIL);

    }
    @And("user enter Valid password")
    public void validpassword()
    {
        obj_p2login.valid_password().sendKeys(Hooks.PASSWORD);


    }
    @And("click on login button")
    public void login_button(){

        obj_p2login.login_btn().click();
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

    }
    @Then("user login to the system successfully")
    public void login_successfully()
    {
        SoftAssert soft = new SoftAssert();
        String currenturl = Hooks.driver.getCurrentUrl();
        String expectedResult ="https://demo.nopcommerce.com/";
        soft.assertEquals(currenturl,expectedResult);
        System.out.println("The web page is : "+ currenturl);

        soft.assertTrue(obj_p2login.myaccount().isDisplayed(),"Second Assertion True");


        soft.assertAll();
    }
    @When("user enter invalid email")
    public void invalid_email()
    {
        obj_p2login.invalidemail().sendKeys("nouran@gmail.com");
    }
    @And("user enter invalid password")
    public void invalid_password()  {

        obj_p2login.invalidpassword().sendKeys("PasssL@");

        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

    }
    @Then("user could not login")
    public void loginn_unsuccessfully()  {
       SoftAssert soft = new SoftAssert();

      String currentmessage = obj_p2login.unsuccessfull_message().getText();
      String expmessage = "Login was unsuccessful. Please correct the errors and try again.";
        soft.assertTrue(currentmessage.contains(expmessage));
        ///soft.assertTrue(currentmessage.);
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        String currentColor = obj_p2login.unsuccessfull_message().getCssValue("color");
        String expcolor = "rgba(228, 67, 75, 1)";
        soft.assertEquals(currentColor.contains(expcolor),true);
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));



        soft.assertAll();
    }
}
