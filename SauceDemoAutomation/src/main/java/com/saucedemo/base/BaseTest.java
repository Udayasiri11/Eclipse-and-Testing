package com.saucedemo.base;

import com.saucedemo.utils.ConfigReader;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    protected static WebDriver driver;
    protected static ConfigReader config;

    public static WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        BaseTest.driver = driver;
    }
}