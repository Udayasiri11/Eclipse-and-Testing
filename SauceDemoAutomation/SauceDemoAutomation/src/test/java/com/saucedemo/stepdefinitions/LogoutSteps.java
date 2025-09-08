package com.saucedemo.stepdefinitions;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.LogoutPage;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class LogoutSteps extends BaseTest {

    LogoutPage logoutPage;

    @When("User clicks on the menu button")
    public void user_clicks_on_the_menu_button() {
        logoutPage = new LogoutPage(getDriver());
        logoutPage.openMenu();
    }

    @When("User clicks on logout")
    public void user_clicks_on_logout() {
        logoutPage.clickLogout();
    }

    @Then("User should be redirected to the login page")
    public void user_should_be_redirected_to_the_login_page() {
        Assert.assertTrue(getDriver().getCurrentUrl().contains("saucedemo.com"), "Not redirected to login page!");
    }
    
    /*@Then("User opens the cart")
    public void User_opens_the_cart() {
    	logoutPage.opencart();
    }*/

    @When("User clicks on continue shopping")
    public void user_clicks_on_continue_shopping() {
        logoutPage.clickContinueShopping();
    }

    @Then("User should be redirected to the inventory page")
    public void user_should_be_redirected_to_the_inventory_page() {
        Assert.assertTrue(getDriver().getCurrentUrl().contains("inventory.html"), "Not redirected to inventory page!");
    }
}
