package com.testng.examples;

import org.testng.annotations.*;

public class BeforeAfterMethod {


    /**
     * @BeforeMethod: The annotated method will be run before each test method.
     */
    @BeforeMethod
    public void verifyProduct() {
        System.out.println("Successfully verified the product");
    }

    /**
     * @AfterMethod: The annotated method will be run after each test method.
     */
    @AfterMethod
    public void verifyStock() {
        System.out.println("Product Stock is available");
    }

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
     * @BeforeTest: The annotated method will be run before any test method belonging to the classes inside the <test> tag is run.
     */
    @BeforeTest
    public void launchBrowser() {
        System.out.println("Successfully launched the browser");
    }

    /**
     * @AfterTest: The annotated method will be run after all the test methods belonging to the classes inside the <test> tag have run.
     */
    @AfterClass
    public void logout() {
        System.out.println("Successfully logged out from the application");
    }

    /**
     * @BeforeClass: The annotated method will be run before the first test method in the current class is invoked.
     */
    @BeforeClass
    public void accessSite() {
        System.out.println("Successfully accessed the site");
    }

    /**
     * @AfterClass: The annotated method will be run after all the test methods in the current class have been run.
     */
    @AfterTest
    public void closeBrowser() {
        System.out.println("Successfully closed the browser");
    }



}
