package com.deepanshu.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.deepanshu.base.BaseTest;

public class LaunchApplicationTest extends BaseTest {

    @Test

    public void verifyApplicationLaunch() {

        String title = driver.getTitle();

        System.out.println(title);

        Assert.assertTrue(title.contains("Swag"));

    }

}