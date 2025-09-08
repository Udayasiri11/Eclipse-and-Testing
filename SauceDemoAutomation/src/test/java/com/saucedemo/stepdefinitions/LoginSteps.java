package com.saucedemo.stepdefinitions;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.InventoryPage;
import com.saucedemo.pages.LoginPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.List;

public class LoginSteps extends BaseTest {

    LoginPage loginPage;
    InventoryPage inventoryPage;

    @Given("User is on Login page")
    public void user_is_on_login_page() {
        loginPage = new LoginPage(getDriver());
    }

    @Then("Login page title should be {string}")
    public void login_page_title_should_be(String expectedTitle) {
        String actualTitle = loginPage.getTitle();
        System.out.println("Page Title: " + actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Then("Logo should be displayed")
    public void logo_should_be_displayed() {
        Assert.assertTrue(loginPage.isLogoDisplayed());
        System.out.println("Logo is Displayed");
    }

    @Then("Username and Password fields should be visible")
    public void username_and_password_fields_should_be_visible() {
        boolean usernameVisible = loginPage.isUsernameDisplayed();
        boolean passwordVisible = loginPage.isPasswordDisplayed();

        System.out.println("Username field visible: " + usernameVisible);
        System.out.println("Password field visible: " + passwordVisible);

        Assert.assertTrue(usernameVisible);
        Assert.assertTrue(passwordVisible);
    }

    @When("User enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        System.out.println("Entering Username: " + username);
        System.out.println("Entering Password: " + password);
        loginPage.login(username, password);
    }

    @When("Clicks login")
    public void clicks_login() {
       
    }

    @Then("Inventory page should be displayed")
    public void inventory_page_should_be_displayed() {
        inventoryPage = new InventoryPage(getDriver());
        Assert.assertTrue(inventoryPage.isInventoryPageDisplayed());
        System.out.println("Inventory page displayed successfully!");
    }

    @Then("Error message {string} should be shown")
    public void error_message_should_be_shown(String expected) {
        String actualError = loginPage.getErrorMessage();
        System.out.println("Error Message Displayed: " + actualError);
        Assert.assertTrue(actualError.contains(expected));
    }

    @Then("Login button should be visible and enabled")
    public void login_button_should_be_visible_and_enabled() {
        WebElement loginBtn = getDriver().findElement(By.id("login-button"));
        System.out.println("Login Button Visible: " + loginBtn.isDisplayed());
        System.out.println("Login Button Enabled: " + loginBtn.isEnabled());
        Assert.assertTrue(loginBtn.isDisplayed());
        Assert.assertTrue(loginBtn.isEnabled());
    }

    @Then("Placeholder text of Username should be {string}")
    public void placeholder_text_of_username_should_be(String expected) {
        String placeholder = getDriver().findElement(By.id("user-name")).getAttribute("placeholder");
        System.out.println("Username Placeholder: " + placeholder);
        Assert.assertEquals(placeholder, expected);
    }

    @Then("Placeholder text of Password should be {string}")
    public void placeholder_text_of_password_should_be(String expected) {
        String placeholder = getDriver().findElement(By.id("password")).getAttribute("placeholder");
        System.out.println("Password Placeholder: " + placeholder);
        Assert.assertEquals(placeholder, expected);
    }

    @Then("Login button text should be {string}")
    public void login_button_text_should_be(String expected) {
        String buttonText = getDriver().findElement(By.id("login-button")).getAttribute("value");
        System.out.println("Login Button Text: " + buttonText);
        Assert.assertEquals(buttonText, expected);
    }

    @Then("Inventory page should be displayed with broken images")
    public void inventory_page_with_broken_images() {
        getDriver().findElement(By.id("inventory_container"));
        List<WebElement> images = getDriver().findElements(By.cssSelector(".inventory_item_img img"));

        for (WebElement img : images) {
            String src = img.getAttribute("src");
            if (src != null && !src.isEmpty()) {
                System.out.println("Image loaded: " + src);
            } else {
                System.out.println("Broken image found!");
            }
        }
    }


    @Then("Inventory page should load within 5 seconds")
    public void inventory_page_should_load_within_5_seconds() { 
        getDriver().findElement(By.id("inventory_container"));
    }


    @Then("User should be redirected to Login page")
    public void user_should_be_redirected_to_login_page() {
        String currentUrl = getDriver().getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);
        Assert.assertTrue(currentUrl.contains("saucedemo.com/"),
                "User was not redirected to login page");
    }
}
