package org.example.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P2_login;
import org.example.pages.P9_wishlist;

import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D9_wishlist {
    P2_login obj_loginwishlist =new P2_login();
    P9_wishlist obj_wishlist=new P9_wishlist();
    @Given("User logged in successfully and User go to home page to shop any product")
    public void loginwishlist() {
        obj_loginwishlist.link_login().click();
        obj_loginwishlist.valid_email().sendKeys(Hooks.EMAIL);
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        obj_loginwishlist.valid_password().sendKeys(Hooks.PASSWORD);
        obj_loginwishlist.login_btn().click();
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
    }

    @When("User clicks on wishlist button on the product")
    public void WishlistButtonofProduct()
    {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        obj_wishlist.productwishlist().click();
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
    }

    @And("green message appear for successful add products to wishlist")
    public void SuccessfulmessageWishlist()  {
       Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
       SoftAssert soft =new SoftAssert();
        String currentmessagew = obj_wishlist.successmessagew().getText();
        String expectedmessagew ="The product has been added to your wishlist";
        soft.assertTrue(currentmessagew.contains(expectedmessagew));

        // soft.assertTrue(currentmessagew.contains(expectedmessagew));
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        //assert for color
        String currentcolorw =obj_wishlist.successmessagecolorw().getCssValue("background-color");
        String expectedcolorw = "rgba(75, 176, 122, 1)";
        soft.assertEquals(currentcolorw.contains(expectedcolorw),true);
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        soft.assertAll();
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Then("User open wishlist page and find the items has been selected")
    public void WishlistPage() {
       Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        obj_wishlist.wishlisticon().click();
        SoftAssert soft =new SoftAssert();
       Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        soft.assertTrue(obj_wishlist.productfoundinwishlist().isDisplayed());


        soft.assertAll();
    }
}
