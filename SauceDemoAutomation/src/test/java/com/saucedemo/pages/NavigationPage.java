package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NavigationPage {
    WebDriver driver;
    WebDriverWait wait;

    // Locators
    private By inventoryContainer = By.id("inventory_container");
    private By backToProductsButton = By.id("back-to-products");
    private By productTitle = By.className("inventory_details_name");

    public NavigationPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Check if inventory page is displayed
    public boolean isInventoryPageDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(inventoryContainer)).isDisplayed();
    }

    // Click product by name
    public void clickProduct(String productName) {
        By productLocator = By.xpath("//div[@class='inventory_item_name ' and text()='" + productName + "']");
        wait.until(ExpectedConditions.elementToBeClickable(productLocator)).click();
    }

    // Get product detail title
    public String getProductTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(productTitle)).getText();
    }

    // Click Back to Products button
    public void clickBackToProducts() {
        wait.until(ExpectedConditions.elementToBeClickable(backToProductsButton)).click();
    }
}
