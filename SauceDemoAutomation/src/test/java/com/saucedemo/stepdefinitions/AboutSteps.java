package com.saucedemo.stepdefinitions;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.MenuPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AboutSteps extends BaseTest {

    WebDriver driver;
    LoginPage loginPage;
    MenuPage menuPage;

    @Given("I am on the SauceDemo login page")
    public void i_am_on_the_saucedemo_login_page() {
        driver = getDriver();
        loginPage = new LoginPage(driver);
        menuPage = new MenuPage(driver);
        Assert.assertTrue(loginPage.isLogoDisplayed(), "Login page logo not displayed!");
    }

    @When("I login with username {string} and password {string}")
    public void i_login_with_username_and_password(String username, String password) {
        loginPage.login(username, password);
    }

    @When("I open the menu")
    public void i_open_the_menu() {
        menuPage.openMenu();
    }

    @When("I click on About")
    public void i_click_on_about() {
        menuPage.clickAbout();
    }

    @Then("I should be redirected to the About page")
    public void i_should_be_redirected_to_the_about_page() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("saucelabs.com"),
                "User is not redirected to Sauce Labs About page. Current URL: " + currentUrl);
    }

    @Then("the About page title should contain {string}")
    public void the_about_page_title_should_contain(String expectedTitle) {
        String title = driver.getTitle();
        Assert.assertTrue(title.contains(expectedTitle),
                "Page title does not contain expected text. Found: " + title);
    }
}
