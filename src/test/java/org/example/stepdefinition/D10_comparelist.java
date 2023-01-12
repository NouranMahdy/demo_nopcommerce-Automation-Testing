package org.example.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P10_comparelist;
import org.example.pages.P2_login;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D10_comparelist {
    P2_login obj_logincompare =new P2_login();
    P10_comparelist obj_compare= new P10_comparelist();
    @Given("user logged in for compare list")
    public void loggedincompare()  {


        obj_logincompare.link_login().click();
        obj_logincompare.valid_email().sendKeys(Hooks.EMAIL);
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        obj_logincompare.valid_password().sendKeys(Hooks.PASSWORD);
        obj_logincompare.login_btn().click();

    }

    @When("user go to home page to shop any product")
    public void GoToHomePage() {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @And("User Add products to compare")
    public void useraddcompareproducts()  {

    obj_compare.product1().click();
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
    obj_compare.product2().click();
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
    }

    @And("Successful message for added products to compare")
    public void successfulMessageCompareList() {
        SoftAssert soft =new SoftAssert();

        String currentmessagec = obj_compare.successmessagec().getText();
        String expectedmessagec ="The product has been added to your product comparison";
        soft.assertTrue(currentmessagec.contains(expectedmessagec));
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        //assert for color
        String currentcolorc =obj_compare.successmessagecolorc().getCssValue("background-color");
        String expectedcolorc = "rgba(75, 176, 122, 1)";
        //soft.assertEquals(currentcolorc.contains(expectedcolorc),true);
        soft.assertEquals(currentcolorc.contains(expectedcolorc),true);
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

        soft.assertAll();
    }

    @Then("User find the products in compare list")
    public void FindProductsinCompareList()  {
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      Hooks.driver.navigate().to("https://demo.nopcommerce.com/compareproducts");
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
Assert.assertTrue(obj_compare.confirmproductincompare().isDisplayed(),"asserttrue");
     // Assert.assertTrue(obj_compare.confirmproductincompare().isDisplayed());




    }
}
