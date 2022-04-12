package com.testng.examples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Iterator;

public class DataProviderTest extends  TestDataProvider{

    @DataProvider(name="products")
    public Object[][] TestData(){
        return new Object[][] {{"Umbrella"}};
    }

    @BeforeClass
    public void accessSite(){
        System.out.println("Successfully access site");
    }

    @Test(dataProvider = "products", priority = 0)
    public void searchProduct(String product1){
        System.out.println("Successfully searched the product : " + product1);
    }

    @Test(dataProvider = "Items", dataProviderClass = TestDataProvider.class, priority = 1)
    public void addToCart(String product){
        System.out.println("Successfully added the product : " + product);
    }

    @AfterClass
    public void closeBrowser(){
        System.out.println("Successfully closed the browser");
    }
}
