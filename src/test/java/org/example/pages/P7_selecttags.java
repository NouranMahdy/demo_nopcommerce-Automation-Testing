package org.example.pages;

import org.example.stepdefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P7_selecttags {


public WebElement apperaltag()
{
    return Hooks.driver.findElement(By.cssSelector("li>a[href=\"/apparel-2\"]"));
}
}
