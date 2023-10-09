package com.selenium.scripts;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class FramesTest {

	WebDriver driver;
    ExtentReports reports;
	ExtentTest test;

	@Test
	public void frameMethods() {
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Autocomplete")).click();
		test.log(LogStatus.PASS, "Clicked on 'AutoComplete' link");
		//driver.switchTo().frame(0); // Switch to iframe based on frame index
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		driver.findElement(By.id("tags")).sendKeys("Selenium");
		test.log(LogStatus.PASS, "Successfully entered the data in a textbox located inside a frame");
		driver.switchTo().defaultContent(); // Switch out from the iframe
		driver.findElement(By.linkText("Draggable")).click(); // Click on the link 'Draggable' which is outside the iframe
		test.log(LogStatus.PASS, "Successfully clicked on the link 'Draggable' which is outside the iframe");
	}

	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
    	driver = new ChromeDriver();
    	reports = new ExtentReports(System.getProperty("user.dir") +"\\Extent Reports\\Automation Results.html", true);
    	test = reports.startTest("Frames Test");
	}

	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(4000);
        driver.quit(); //tear down operation
        reports.endTest(test);
		reports.flush();
	}

}
