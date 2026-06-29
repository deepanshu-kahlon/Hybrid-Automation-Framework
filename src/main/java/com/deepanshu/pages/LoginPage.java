package com.deepanshu.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(id="user-name")
    WebElement txtUsername;

    @FindBy(id="password")
    WebElement txtPassword;

    @FindBy(id="login-button")
    WebElement btnLogin;

    public void enterUsername(String username) {

        txtUsername.clear();
        txtUsername.sendKeys(username);

    }

    public void enterPassword(String password) {

        txtPassword.clear();
        txtPassword.sendKeys(password);

    }

    public void clickLogin() {

        btnLogin.click();

    }

    public void login(String username,String password) {

        enterUsername(username);
        enterPassword(password);
        clickLogin();

    }

}