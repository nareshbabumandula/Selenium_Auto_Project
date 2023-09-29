package com.selenium.scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AmazonTest extends Generic {
	
	@Parameters({"username"})
    @BeforeClass
    public void login(String username){
        System.out.println(username + " : logged in successfully");
    }

    @BeforeTest
    public void accessSite(){
        System.out.println("Accessed amazon website");
    }

    @Test(priority = 4)
    public void searchProduct(){
        System.out.println("Searched the product");
    }

    @Test(priority = 5)
    public void addToCart(){
        System.out.println("Added the product to cart");
    }
    
    @AfterClass
    public void viewReceipt(){
        System.out.println("Viewed the receipt");
    }

    @Test(priority = 6)
    public void checkOut(){
        System.out.println("Checkedout the product");
    }
     
    @Test(priority = 7)
    public void proceedToBuy(){
        System.out.println("Proceeded to buy");
    }

    @Test(priority = 8)
    public void placeOrder(){
        System.out.println("Successfully placed an order");
    }

    @AfterTest
    public void logout(){
        System.out.println("Logged out from the application");
    }
    
    @BeforeMethod
    void verifyProduct() {
    	System.out.println("Verified the product");
    }
    
    @AfterMethod
    void verifyUser() {
    	System.out.println("Verified the user");
    }

}
