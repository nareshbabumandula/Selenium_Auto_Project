package com.selenium.scripts;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Generic {
	ExtentReports reports;
	ExtentTest test;
	
	@Parameters({"browser"})
	@BeforeSuite
	public void launchBrowser(String browser){
		reports = new ExtentReports(System.getProperty("user.dir") +"\\Extent Reports\\Automation Results.html", true);
		test = reports.startTest("Amazon");
		System.out.println(browser + " browser launched");
		test.log(LogStatus.PASS, browser + " browser launched");
	}

	@AfterSuite
	public void closeBrowser(){
		System.out.println("Closed the browser");
		test.log(LogStatus.PASS, "Closed the browser");
		reports.endTest(test);
		reports.flush();
	}
}
