package org.example.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P1_register;

import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D1_register {

   P1_register obj_P1register = new P1_register();
    @Given("user go to register page")
    public void user_register()
    {
      // .click();
        obj_P1register.resgisterlink().click();
    }
    @When("user select the gender type")
    public void gender()
    {
     obj_P1register.user_gender().click();
    }

    @And("user enter first name")
    public void first_name()
    {

        obj_P1register.f_name().sendKeys("Ahmed");
    }
  @And("user enter last name")
  public void Last_name()
  {
    obj_P1register.l_name().sendKeys("Mahdy");
  }

    @And("user enter email")
    public void email()
    {
        obj_P1register.user_email().sendKeys(Hooks.EMAIL);
    }
    @And("user enter birth date")
    public void birthdate()  {

        Select d = new Select(obj_P1register.day());
        d.selectByIndex(10);

       Select m = new Select(obj_P1register.month());
       m.selectByValue("3");

        Select y = new Select(obj_P1register.year());
        y.selectByVisibleText("1915");
       // sel.selectByValue("1915");
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

    }
    @And("user enter company name")
    public void company()
    {
        obj_P1register.company_name().sendKeys("amazon");
    }
    @And("user enter password")
    public void password()
    {
        obj_P1register.user_password().sendKeys(Hooks.PASSWORD);

    }
    @And("user enter confirmation")
    public void confirmation_password() {
        obj_P1register.confirm_password().sendKeys(Hooks.PASSWORD);
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

    }
    @And("user clicks on register button")
    public void register_button()
    {
        obj_P1register.register_btn().click();
    }
    @Then("user register successfully with the message")
    public void register_success_message()  {
        SoftAssert soft =new SoftAssert();


        String actualColor = obj_P1register.success_message().getCssValue("color");
        String expectedColor = "rgba(76, 177, 124, 1)";  //color in rgba
        soft.assertEquals(actualColor.contains(expectedColor),true);

        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        String expectedResult = "Your registration completed";
        String actualResult =obj_P1register.success_message().getText();
        soft.assertTrue(actualResult.contains(expectedResult));

        soft.assertAll();

    }
@And("user clicks on continue button")
    public void con_button() {
    obj_P1register.continue_btn().click();
    Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));


}

}
