package com.testng.examples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestReadParameters {
    @BeforeClass
    public void accessSite(){
        System.out.println("Successfully access site");
    }

    @Parameters({"product"})
    @Test()
    public void searchProduct(String product){
        System.out.println("Successfully searched the product : " + product);
    }

    @AfterClass
    public void closeBrowser(){
        System.out.println("Successfully closed the browser");
    }
}
