package com.saucedemo.stepdefinitions;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.NavigationPage;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class NavigationSteps extends BaseTest {

    private LoginPage loginPage;
    private NavigationPage navigationPage;

    @Given("I am logged into SauceDemo as {string} with password {string}")
    public void i_am_logged_into_sauce_demo_as_with_password(String username, String password) {
        loginPage = new LoginPage(getDriver());
        loginPage.login(username, password);
        navigationPage = new NavigationPage(getDriver());
        Assert.assertTrue(navigationPage.isInventoryPageDisplayed(),
                "Inventory page not displayed after login!");
    }

    @When("I click on product {string}")
    public void i_click_on_product(String productName) {
        navigationPage.clickProduct(productName);
    }

    @Then("I should be on the product detail page for {string}")
    public void i_should_be_on_the_product_detail_page_for(String expectedTitle) {
        String actualTitle = navigationPage.getProductTitle();
        Assert.assertEquals(actualTitle, expectedTitle,
                "Product title mismatch on detail page!");
    }

    @When("I click on the Back to products button")
    public void i_click_on_the_back_to_products_button() {
        navigationPage.clickBackToProducts();
    }

    @Then("I should be redirected to the inventory page")
    public void i_should_be_redirected_to_the_inventory_page() {
        Assert.assertTrue(navigationPage.isInventoryPageDisplayed(),
                "Did not return to inventory page!");
    }
}
