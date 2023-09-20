package com.selenium.scripts;

import org.testng.annotations.Test;

public class AmazonTest {
	
    @Test(priority = 3)
    public void login(){
        System.out.println("logged in successfully");
    }

    @Test(priority = 1)
    public void launchBrowser(){
        System.out.println("Browser launched");
    }

    @Test(priority = 2)
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
    
    @Test(priority = 9)
    public void viewReceipt(){
        System.out.println("Viewed the receipt");
    }

    @Test(priority = 6)
    public void checkOut(){
        System.out.println("Checkedout the product");
    }

    @Test(priority = 11)
    public void closeBrowser(){
        System.out.println("Closed the browser");
    }
    
    @Test(priority = 7)
    public void proceedToBuy(){
        System.out.println("Proceeded to buy");
    }

    @Test(priority = 8)
    public void placeOrder(){
        System.out.println("Successfully placed an order");
    }

    @Test(priority = 10)
    public void logout(){
        System.out.println("Logged out from the application");
    }
  

}
