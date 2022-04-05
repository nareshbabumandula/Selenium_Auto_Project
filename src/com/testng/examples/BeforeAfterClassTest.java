package com.testng.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeAfterClassTest {
    /**
     * Marks a class or a method as part of the test
     * The priority for this test method. Lower priorities will be scheduled first.
     */
    @Test(priority = 1)
    public void searchProduct() {
        System.out.println("Successfully searched the product");
    }

    @Test(priority = 2)
    public void addToCart() {
        System.out.println("Successfully added the product to the cart");
    }

    /**
     * @BeforeClass: The annotated method will be run before the first test method in the current class is invoked.
     */
    @BeforeClass
    public void accessSite() {
        System.out.println("Successfully launched the browser");
    }

    /**
     * @AfterClass: The annotated method will be run after all the test methods in the current class have been run.
     */
    @AfterClass
    public void logout() {
        System.out.println("Successfully logged out from the application");
    }



}
