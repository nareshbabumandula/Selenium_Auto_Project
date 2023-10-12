package com.selenium.scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class AmazonModules {

	WebDriver driver;

	ExtentReports reports;
	ExtentTest test;

	@BeforeClass
	public void launchBrowser(){
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		reports = new ExtentReports(System.getProperty("user.dir") +"\\Extent Reports\\Automation Results.html", true);
		test = reports.startTest("Get All Module Names in Amazon");
	}

	@Test
	public void textboxMethods() throws InterruptedException {
		String err_Msg;
		try {
			driver.get("https://www.amazon.com/");
			driver.manage().window().maximize(); // maximize the browser window
			List<WebElement> modules = driver.findElements(By.xpath("//div[@id='nav-xshop']/a"));
			System.out.println("No of modules found are : " + modules.size());
			
			//modules.forEach(module->System.out.println(module.getText()));
			
			for (WebElement module : modules) {
				System.out.println(module.getText());
			}

			test.log(LogStatus.PASS, "Successfully retrieved all the module names in Amazon");
		} catch (Exception e) {
			//String x = e.printStackTrace();
			test.log(LogStatus.FAIL, "Failed to use all the module names in Amazon since : " +e.getMessage());
			e.printStackTrace();
		}
	}

	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit(); //tear down operation
		reports.endTest(test);
		reports.flush();
	}


}
