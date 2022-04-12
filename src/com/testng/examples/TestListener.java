package com.testng.examples;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.testng.examples.TestNGListenter.class)
public class TestListener {

    @BeforeClass
    public void accessSite() {
        System.out.println("Successfully launched the browser");
    }

    @Test
    public void searchProduct() {
        System.out.println("This method to test fail");
        Assert.assertTrue(true);
    }

    @AfterClass
    public void logout() {
        System.out.println("Successfully logged out from the application");
    }
}
