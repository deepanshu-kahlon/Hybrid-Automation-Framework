package com.deepanshu.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.deepanshu.base.BaseTest;
import com.deepanshu.pages.HomePage;
import com.deepanshu.pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void verifyValidLogin() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(
                config.getUsername(),
                config.getPassword());

        HomePage homePage = new HomePage(driver);

        Assert.assertEquals(homePage.getPageTitle(), "Products");

    }
}