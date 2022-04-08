package com.testng.examples;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestWithParameters {

    @BeforeClass
    public void accessSite(){
        System.out.println("Successfully accessed the site..!");
    }

    @Test(priority = 1)
    public void searchProduct(){
        System.out.println("Successfully searched the product");
    }

    @Test(priority = 2)
    public void verifyStock(){
        System.out.println("Successfully verified the product stock");
        Assert.assertEquals("no stock", "stock", "Stock not available..!");
    }

    //	alwaysRun : If set to true, this test method will always be run even if it depends on a method
    //	that failed.
    @Test(dependsOnMethods = {"verifyStock"}, alwaysRun = true)
    public void addtoWishList(){
        System.out.println("Successfully added the product to the wish list");
    }

    @Test(enabled = true, invocationCount = 10)
    public void addToCart(){
        System.out.println("Successfully added the product to the cart");
    }

    @AfterClass
    public void closeBrowser(){
        System.out.println("Successfully closed the browser");
    }


}
