package com.saucedemo.stepdefinitions;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.CartPage;
import io.cucumber.java.en.*;
import org.testng.Assert;

import java.util.List;

public class CartSteps extends BaseTest {

    CartPage cartPage;

    @When("User adds {string} to the cart")
    public void user_adds_to_the_cart(String productName) {
        cartPage = new CartPage(getDriver());
        cartPage.addProduct(productName);
    }

    @When("User adds products:")
    public void user_adds_products(io.cucumber.datatable.DataTable dataTable) {
        cartPage = new CartPage(getDriver());
        for (String product : dataTable.asList()) {
            cartPage.addProduct(product);
        }
    }

    @When("User opens the cart")
    public void user_opens_the_cart() {
        cartPage = new CartPage(getDriver());
        cartPage.openCart();
    }

    @Then("Cart badge should show {string}")
    public void cart_badge_should_show(String expectedCount) {
        cartPage = new CartPage(getDriver());
        String actualBadge = cartPage.getCartBadgeCount();
        System.out.println("Cart badge: " + actualBadge);
        Assert.assertEquals(actualBadge, expectedCount, "Cart badge count mismatch!");
    }

    @Then("Cart should contain {string}")
    public void cart_should_contain(String productName) {
        List<String> items = cartPage.getCartItems();
        System.out.println("Items in cart: " + items);
        Assert.assertTrue(items.contains(productName),
                "Cart does not contain " + productName);
    }

    @When("User removes {string} from the cart")
    public void user_removes_from_the_cart(String productName) {
        cartPage.removeProduct(productName);
    }

    @Then("Cart should be empty")
    public void cart_should_be_empty() {
        Assert.assertTrue(cartPage.isCartEmpty(), "Cart is not empty!");
    }
}
