package com.saucedemo.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class InventoryPage {
    WebDriver driver;
    WebDriverWait wait;

    // Locators
    private By inventoryContainer = By.id("inventory_container");
    private By sortDropdown = By.className("product_sort_container");
    private By productNames = By.className("inventory_item_name");
    private By productPrices = By.className("inventory_item_price");

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public boolean isInventoryPageDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(inventoryContainer)).isDisplayed();
    }

    public boolean isFilterDropdownVisible() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(sortDropdown)).isDisplayed();
    }

    public List<String> getFilterOptions() {
        List<String> optionsText = new ArrayList<>();
        Select select = new Select(driver.findElement(sortDropdown));
        List<WebElement> options = select.getOptions();

        for (WebElement option : options) {
            optionsText.add(option.getText());
        }
        return optionsText;
    }

    public void selectSortOption(String option) {
        Select select = new Select(driver.findElement(sortDropdown));
        select.selectByVisibleText(option);
    }

    public List<String> getProductNames() {
        List<String> names = new ArrayList<>();
        List<WebElement> elements = driver.findElements(productNames);

        for (WebElement e : elements) {
            names.add(e.getText());
        }
        return names;
    }

    public List<Double> getProductPrices() {
        List<Double> prices = new ArrayList<>();
        List<WebElement> elements = driver.findElements(productPrices);

        for (WebElement e : elements) {
            String priceText = e.getText().replace("$", "").trim();
            try {
                prices.add(Double.parseDouble(priceText));
            } catch (NumberFormatException ex) {
                System.out.println("Could not parse price: " + priceText);
            }
        }
        return prices;
    }
}
