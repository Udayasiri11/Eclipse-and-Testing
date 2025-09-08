package com.saucedemo.stepdefinitions;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.InventoryPage;
import com.saucedemo.pages.LoginPage;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InventorySteps extends BaseTest {
    WebDriver driver;
    LoginPage loginPage;
    InventoryPage inventoryPage;

    @Given("User is logged in with {string} and {string}")
    public void user_is_logged_in_with_and(String username, String password) {
        driver = getDriver();
        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);

        loginPage.login(username, password);

        if (inventoryPage.isInventoryPageDisplayed()) {
            System.out.println("Inventory page displayed after login.");
        } else {
            System.out.println("Inventory page NOT displayed!");
        }
    }

    @Then("Inventory page title should be {string}")
    public void inventory_page_title_should_be(String title) {
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(title)) {
            System.out.println("Title matched: " + actualTitle);
        } else {
            System.out.println("Title mismatch. Expected: " + title + " but got: " + actualTitle);
        }
    }

    @Then("Products should be visible")
    public void products_should_be_visible() {
        if (inventoryPage.isInventoryPageDisplayed()) {
            System.out.println("Products are visible on Inventory page.");
        } else {
            System.out.println("Products are NOT visible.");
        }
    }

    @Then("User should be redirected to login page")
    public void user_should_be_redirected_to_login_page() {
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.contains("saucedemo.com")) {
            System.out.println("User is on login page. URL: " + currentUrl);
        } else {
            System.out.println("User not redirected to login page. URL: " + currentUrl);
        }
    }

    @Then("Filter dropdown should be visible")
    public void filter_dropdown_should_be_visible() {
        if (inventoryPage.isFilterDropdownVisible()) {
            System.out.println("Filter dropdown is visible.");
        } else {
            System.out.println("Filter dropdown is NOT visible.");
        }
    }

    @Then("Filter dropdown should have options:")
    public void filter_dropdown_should_have_options(io.cucumber.datatable.DataTable dataTable) {
        List<String> expectedOptions = dataTable.asList();
        List<String> actualOptions = inventoryPage.getFilterOptions();

        if (expectedOptions.equals(actualOptions)) {
            System.out.println("Filter options matched: " + actualOptions);
        } else {
            System.out.println("Filter options mismatch! Expected: " + expectedOptions + " but got: " + actualOptions);
        }
    }

    @When("User selects {string} from filter dropdown")
    public void user_selects_from_filter_dropdown(String option) {
        inventoryPage.selectSortOption(option);
        System.out.println(" Selected filter option: " + option);
    }

    @Then("Products should be sorted in ascending order")
    public void products_should_be_sorted_in_ascending_order() {
        List<String> productNames = inventoryPage.getProductNames();
        List<String> sorted = new ArrayList<>(productNames);
        Collections.sort(sorted);

        if (productNames.equals(sorted)) {
            System.out.println("Products sorted A-Z correctly.");
        } else {
            System.out.println("Products not sorted A-Z. Actual: " + productNames);
        }
    }

    @Then("Products should be sorted in descending order")
    public void products_should_be_sorted_in_descending_order() {
        List<String> productNames = inventoryPage.getProductNames();
        List<String> sorted = new ArrayList<>(productNames);
        Collections.sort(sorted, Collections.reverseOrder());

        if (productNames.equals(sorted)) {
            System.out.println("Products sorted Z-A correctly.");
        } else {
            System.out.println("Products not sorted Z-A. Actual: " + productNames);
        }
    }

    @Then("Products should be sorted by increasing price")
    public void products_should_be_sorted_by_increasing_price() {
        List<Double> prices = inventoryPage.getProductPrices();
        List<Double> sorted = new ArrayList<>(prices);
        Collections.sort(sorted);

        if (prices.equals(sorted)) {
            System.out.println("Products sorted by Low → High price.");
        } else {
            System.out.println("Products not sorted Low → High. Actual: " + prices);
        }
    }

    @Then("Products should be sorted by decreasing price")
    public void products_should_be_sorted_by_decreasing_price() {
        List<Double> prices = inventoryPage.getProductPrices();
        List<Double> sorted = new ArrayList<>(prices);
        Collections.sort(sorted, Collections.reverseOrder());

        if (prices.equals(sorted)) {
            System.out.println("Products sorted by High → Low price.");
        } else {
            System.out.println("Products not sorted High → Low. Actual: " + prices);
        }
    }
}
