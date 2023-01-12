package org.example.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P2_login;
import org.example.pages.P8_addtocart;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D8_addtocart {

    P2_login obj_logincart =new P2_login();
    P8_addtocart objadd = new P8_addtocart();
    @Given("User logged in successfully")
    public void logincart() {
            obj_logincart.link_login().click();
            obj_logincart.valid_email().sendKeys(Hooks.EMAIL);
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
            obj_logincart.valid_password().sendKeys(Hooks.PASSWORD);
            obj_logincart.login_btn().click();

        }

    @When("User go to home page to shop any product")
    public void HomePageToShopProducts() {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @And("User add products to cart")
    public void AddProductsToCart(){

        objadd.bookcategory().click();
        objadd.bookaddcart().click();
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
      //  Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
       // Thread.sleep(3000);

        SoftAssert soft =new SoftAssert();
        String currentmessage = objadd.successmessage().getText();
        String expectedmessage ="The product has been added to your shopping cart";
        soft.assertTrue(currentmessage.contains(expectedmessage));

        //assert for color
        String currentcolor =objadd.successmessagecolor().getCssValue("background-color");
        String expectedcolor = "rgba(75, 176, 122, 1)";
        soft.assertEquals(currentcolor.contains(expectedcolor),true);

        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

    }

    @Then("User find the products in shopping cart")
    public void FindTheProductsInShoppingCart() {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/cart");
        Assert.assertTrue(objadd.itemfound().isDisplayed());



    }
}
