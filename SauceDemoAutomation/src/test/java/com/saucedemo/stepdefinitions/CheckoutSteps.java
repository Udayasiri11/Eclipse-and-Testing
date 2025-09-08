package com.saucedemo.stepdefinitions;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.CheckoutPage;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class CheckoutSteps extends BaseTest{

    CheckoutPage checkoutPage;

    @When("User clicks on checkout button")
    public void user_clicks_on_checkout_button() {
        checkoutPage = new CheckoutPage(getDriver());
        checkoutPage.clickCheckout();
    }

    @When("User enters checkout details {string} {string} {string}")
    public void user_enters_checkout_details(String firstName, String lastName, String postalCode) {
        checkoutPage.enterCheckoutDetails(firstName, lastName, postalCode);
    }

    @When("User clicks continue")
    public void user_clicks_continue() {
        checkoutPage.clickContinue();
    }

    @Then("Checkout overview page should be displayed")
    public void checkout_overview_page_should_be_displayed() {
        Assert.assertTrue(checkoutPage.isOverviewDisplayed(), "Checkout overview not displayed!");
    }

    @When("User clicks finish")
    public void user_clicks_finish() {
        checkoutPage.clickFinish();
    }

    @Then("Order confirmation message should be displayed")
    public void order_confirmation_message_should_be_displayed() {
        Assert.assertTrue(checkoutPage.isConfirmationDisplayed(), "Order confirmation not displayed!");
    }

    @When("User clicks cancel")
    public void user_clicks_cancel() {
        checkoutPage.clickCancel();
    }

    @Then("User should be redirected back to the cart page")
    public void user_should_be_redirected_back_to_the_cart_page() {
        Assert.assertTrue(getDriver().getCurrentUrl().contains("cart.html"), "Not redirected to cart page!");
    }
}
