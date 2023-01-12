package org.example.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P11_createorder;
import org.example.pages.P2_login;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D11_createorder {
    P2_login obj_logincreateorder =new P2_login();
    P11_createorder obj_createorder= new P11_createorder();
    @Given("user loggedin for making order")
    public void loginorder() {

        obj_logincreateorder.link_login().click();
        obj_logincreateorder.valid_email().sendKeys(Hooks.EMAIL);
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        obj_logincreateorder.valid_password().sendKeys(Hooks.PASSWORD);
        obj_logincreateorder.login_btn().click();

    }
    @When("user clickedon shoppingcart")
    public void shoppingcart() {
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        obj_createorder.shoppingcartbutton().click();

        obj_createorder.termsofservice().click();
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        obj_createorder.checkoutbutton().click();
    }

    @And("User fill data for make the order")
    public void FillrDatatoMakeTheOrder() {

     obj_createorder.country().click();
        obj_createorder.country().sendKeys("Egypt");
        obj_createorder.country().click();
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        obj_createorder.city().sendKeys("cairo");
        obj_createorder.address().sendKeys("nasr city ");
        obj_createorder.postalcode().sendKeys("16358");
        obj_createorder.phone().sendKeys("01005895448");
        obj_createorder.fax().sendKeys("52145");
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        obj_createorder.continueorderbutton().click();
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        obj_createorder.shippingaddress().click();
       Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        obj_createorder.paymentmethod().click();
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        obj_createorder.paymentinfo().click();
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        obj_createorder.confirmorder().click();

    }

    @Then("Order created successfully")
    public void orderCreatedSuccessfully() {
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        SoftAssert soft =new SoftAssert();
      String current=obj_createorder.confirmmsg().getText();
      String expected = "Your order has been successfully processed!";
      Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        soft.assertTrue(current.contains(expected));
       // Assert.assertEquals(current,"Your order has been successfully processed!");
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
    }
}
