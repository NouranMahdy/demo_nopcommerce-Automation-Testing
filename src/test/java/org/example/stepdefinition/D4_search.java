package org.example.stepdefinition;

import io.cucumber.java.en.And;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P4_search;

import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D4_search {

    P4_search obj4_search = new P4_search();

    @When("user clicks on search field")
    public void search_field() {
        obj4_search.searchfield().click();

    }

    @And("user search {string}")
    public void userSearch(String arg0) {
        obj4_search.searchfield().sendKeys(arg0);
        obj4_search.search_button().click();
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

    }

    @Then("user find {string}")
    public void userFind(String arg1) {

        SoftAssert soft = new SoftAssert();
        for (int i = 0; i < obj4_search.searchlist().size(); i++) {
            String result = obj4_search.searchlist().get(i).getText();

            System.out.println(result);
            soft.assertTrue(result.toLowerCase().contains(arg1));
        }
    }


    @Then("user find sku product {string}")
    public void userFindSkuProduct(String arg2) {


        SoftAssert soft = new SoftAssert();
        for (int i = 0; i < obj4_search.searchlist().size(); i++) {

            String size = String.valueOf(obj4_search.searchlist().size());
            String expectedSize = "1";
            System.out.println(size);
            soft.assertEquals(size.contains(expectedSize),true);

            obj4_search.clickedproduct().click();
            String actualsku =obj4_search.productsku().getText();
            String expecteddsku=arg2;
            Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

           System.out.println(actualsku);
            soft.assertEquals(actualsku.contains(expecteddsku),true);
           soft.assertAll();
        }

    }
}