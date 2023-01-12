package org.example.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P12_resetpassword;
import org.example.pages.P2_login;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D12_resetpassword {
    P2_login p2login =new P2_login();
    P12_resetpassword obj_reset =new P12_resetpassword();
    @Given("User go to login page")
    public void gotologin()
    {
     p2login.link_login().click();
    }


    @When("User clicked reset password button")
    public void ClickedResetPassword() {
        obj_reset.forgetpassword().click();
    }

    @And("User enter email to send the key to reset the password")
    public void EnterEmailtoreset() {
        p2login.valid_email().sendKeys(Hooks.EMAIL);
    }

    @And("User clicked the reset button")
    public void ClickedtheResetButton()  {
        obj_reset.resetbutton().click();
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }

    @Then("The website send to email has been register")
    public void sendtoemail() {
        SoftAssert soft = new SoftAssert();
        String currentmsg=obj_reset.resetmessage().getText();
        String expectmsg="Email with instructions has been sent to you.";
        soft.assertTrue(currentmsg.contains(expectmsg),"truemessage");
    }
}
