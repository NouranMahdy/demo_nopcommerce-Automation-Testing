package org.example.stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver=null;
   public static String EMAIL = "ahmeddhatem@gmail.com";
   public static String PASSWORD = "paSSwOrd@";
    @Before
    public static void open_browser()
    {
        //bridge
        System.setProperty("webdriver.chrome.driver","F:\\java projects\\demonopCommerceAutomationTesting\\src\\main\\resources\\chromedriver.exe");
       // String path= System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
      //  System.setProperty("webdriver.chrome.driver", path);

         //new object from chromedriver
        driver = new ChromeDriver();

        //con
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
          driver.navigate().to("https://demo.nopcommerce.com/");

    }

    @After
    public static void close_browser(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        driver.quit();

    }
}
