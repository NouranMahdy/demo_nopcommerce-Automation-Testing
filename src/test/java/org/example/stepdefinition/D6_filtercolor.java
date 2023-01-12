package org.example.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P2_login;
import org.example.pages.P6_filtercolor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class D6_filtercolor {

    P2_login obj_loginfilter =new P2_login();
    P6_filtercolor obj_filtercolor =new P6_filtercolor();
   // D2_login obj =new D2_login();
    @Given("User should logged in successfully")
    public void login_filter() throws InterruptedException {

        obj_loginfilter.link_login().click();
        obj_loginfilter.valid_email().sendKeys(Hooks.EMAIL);
        Thread.sleep(3000);
        obj_loginfilter.valid_password().sendKeys(Hooks.PASSWORD);
        obj_loginfilter.login_btn().click();
        Thread.sleep(3000);

    }
    @When("User select an item to filter")
    public void SelectAnItemToFilter() throws InterruptedException {
        Thread.sleep(2000);
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(obj_filtercolor.apperal()).perform();
        obj_filtercolor.shoes().click();
    }

    @And("User filter items by color")
    public void FilterByColor() {
        obj_filtercolor.choosencolor().click();
    }

    @Then("User appear for him the filter items with color he choosed")
    public void userAppearForHimTheFilterItemsWithColorHeChoosed() {

        boolean enablebutton = obj_filtercolor.choosencolor().isEnabled();
        Assert.assertTrue(enablebutton,"button enabled");

    }
}
