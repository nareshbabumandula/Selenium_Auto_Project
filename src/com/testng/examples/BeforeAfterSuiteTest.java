package com.testng.examples;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BeforeAfterSuiteTest {

    @BeforeSuite(groups = "smoke")
    public void launchBrowser() {
        System.out.println("Launched the browser");
    }
    @AfterSuite(groups = "smoke")
    public void closeBrowser() {
        System.out.println("Closed the browser");
    }
}
