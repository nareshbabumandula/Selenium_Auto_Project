package com.testng.examples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeAfterClassTest {

        @Test(priority = 1)
        public void verifylogin() {
            System.out.println("Successfully logged into amazon portal");
        }

        @Test(priority = 2)
        public void searchProduct() {
            System.out.println("Successfully searched the product");
        }

        @Test(priority = 3)
        public void addtoCart() {
            System.out.println("Successfully added the product to the cart");
        }


    @BeforeClass
        public void accessSite() {
            System.out.println("Accessed mycontactform site");
        }

        @AfterClass
        public void closeBrowser() {
            System.out.println("Closed browser");
        }


}
