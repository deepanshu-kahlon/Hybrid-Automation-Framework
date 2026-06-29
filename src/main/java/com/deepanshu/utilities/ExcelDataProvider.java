package com.deepanshu.utilities;

import org.testng.annotations.DataProvider;

public class ExcelDataProvider {

    @DataProvider(name="LoginData")

    public Object[][] loginData(){

        return ExcelUtil.getLoginData();

    }

}