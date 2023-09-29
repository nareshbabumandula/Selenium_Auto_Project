package com.selenium.scripts;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Generic {

	@BeforeSuite
	public void launchBrowser(){
		System.out.println("Browser launched");
	}

	@AfterSuite
	public void closeBrowser(){
		System.out.println("Closed the browser");
	}
}
