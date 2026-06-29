package com.deepanshu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By productsTitle = By.className("title");

    public String getPageTitle() {
        return driver.findElement(productsTitle).getText();
    }
}