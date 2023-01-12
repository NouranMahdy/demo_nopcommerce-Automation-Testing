package org.example.stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P3_currencies;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D3_currencies {

    P3_currencies obj_p3 =new P3_currencies();
    @When("user select Euro from the list on the top of home page")
    public void currency_list()
    {
        Select select = new Select(obj_p3.currency_list());
        select.selectByVisibleText("Euro");
    }
    @Then("products will be displayed as choosen currency")
    public void products_prices()
    {
       SoftAssert soft = new SoftAssert();
        for(int x = 0; x<obj_p3.productprices().size(); x++) {
            String value = obj_p3.productprices().get(x).getText();


            String actualResult =obj_p3.productprices().get(x).getText();
            String expectedResult = "€";
            System.out.println(actualResult);
            soft.assertTrue(actualResult.contains(expectedResult));


        }
    }
}
