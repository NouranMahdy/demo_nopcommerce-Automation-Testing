package org.example.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.pages.P5_hovercategories;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class D5_hovercategories {

    P5_hovercategories obj_p5hover = new P5_hovercategories();
   // D5_hovercategories obj =new D5_hovercategories();
    @When("user hover over the main categories and select one random sub category")
    public void hover()
    {
        Actions hover = new Actions(Hooks.driver);
        int randomvalue_cat = new Random().nextInt(3);
      //  int size = obj_p5hover.main_category().size();
        hover.moveToElement(obj_p5hover.main_category().get(randomvalue_cat)).perform();
        String selectedcategory =obj_p5hover.main_category().get(randomvalue_cat).getText();
        System.out.println(selectedcategory);
      Hooks.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);


         randomvalue_cat = randomvalue_cat +1;
         List<WebElement> subcategory = Hooks.driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[" + randomvalue_cat + "]/ul[@class=\"sublist first-level\"]/li"));
          int randomvalue_sub= new Random().nextInt(3);
        String selectedsubcategory = subcategory.get(randomvalue_sub).getText();
        subcategory.get(randomvalue_sub).click();

          System.out.println(selectedsubcategory);
        Hooks.driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

        SoftAssert soft = new SoftAssert();

        String currentcategory= obj_p5hover.categoryname().getText();
        soft.assertTrue(currentcategory.toLowerCase().trim().contains(selectedcategory.toLowerCase().trim()));

         String currentsubcategory = obj_p5hover.subcategoryname().getText();
         soft.assertTrue(currentsubcategory.toLowerCase().trim().contains(selectedsubcategory.toLowerCase().trim()));
        soft.assertAll();

    }

}
