package com.deepanshu.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.deepanshu.config.ConfigReader;
import com.deepanshu.factory.DriverFactory;

public class BaseTest {

    protected WebDriver driver;
    protected ConfigReader config;

    @BeforeMethod
    public void setup() {

        config = new ConfigReader();

        driver = DriverFactory.initializeDriver();

        driver.get(config.getURL());
    }

    @AfterMethod
    public void tearDown() {

        if(driver != null)
            driver.quit();
    }
}