package com.deepanshu.base;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import com.deepanshu.config.ConfigReader;
import com.deepanshu.factory.DriverFactory;
import com.deepanshu.utilities.ScreenshotUtil;

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
    public void tearDown(ITestResult result) 
    {


        if(result.getStatus()==ITestResult.FAILURE) {

            ScreenshotUtil.capture(driver,result.getName());

        }

        driver.quit();
    }
}