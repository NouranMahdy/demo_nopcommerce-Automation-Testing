package org.example.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P2_login;
import org.example.pages.P5_hovercategories;
import org.example.pages.P7_selecttags;

import java.time.Duration;

public class D7_selecttags {

    P2_login obj_logintag =new P2_login();
   P7_selecttags obj_selectedtag =new P7_selecttags();
    D5_hovercategories obj_hovertag  =new D5_hovercategories();
    @Given("user should logged in successfully")
    public void login_tags() throws InterruptedException {
        obj_logintag.link_login().click();
        obj_logintag.valid_email().sendKeys(Hooks.EMAIL);
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        obj_logintag.valid_password().sendKeys(Hooks.PASSWORD);
        obj_logintag.login_btn().click();
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
    }

    @When("user select any category")
    public void SelectAnyCategory() {
        obj_hovertag.hover();

    }

    @Then("user select different tags")
    public void SelectTags() {
        obj_selectedtag.apperaltag().click();

    }


}
