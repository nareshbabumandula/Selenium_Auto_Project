package com.testng.examples;

import org.testng.annotations.DataProvider;

public class TestDataProvider {

    @DataProvider(name="Items")
    public Object[][] productsData(){
        return new Object[][] {{"iphone"}, {"samsung"}, {"realme"}};
    }
}
