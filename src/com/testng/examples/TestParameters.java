package com.testng.examples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameters extends  TestDataProvider{

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

    @Test(invocationCount = 10, priority = 2)
    public void verifyProduct(){
        System.out.println("Successfully verified the product");
    }

    @Test(timeOut = 3000, priority = 3)
    public void checkStock() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Successfully checked the stock");
    }


    @AfterClass
    public void closeBrowser(){
        System.out.println("Successfully closed the browser");
    }
}
