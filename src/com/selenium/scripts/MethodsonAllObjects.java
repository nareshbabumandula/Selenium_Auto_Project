package com.selenium.scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class MethodsonAllObjects {

    WebDriver driver;
    
    ExtentReports reports;
	ExtentTest test;

    @BeforeClass
    public void launchBrowser(){
    	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
    	driver = new ChromeDriver();
    	reports = new ExtentReports(System.getProperty("user.dir") +"\\Extent Reports\\Automation Results.html", true);
		test = reports.startTest("Selenium : Working with all types of objects");
    }

    @Test
    public void objectsMethods() throws InterruptedException {

    	try {
			driver.get("https://www.mycontactform.com/");
			driver.manage().window().maximize(); // maximize the browser window
			driver.findElement(By.linkText("Sample Forms")).click(); // Click on SampleForms Tab Link
			driver.findElement(By.name("email_to[]")).click(); // Click on Checkbox
			driver.findElement(By.id("subject")).sendKeys("Test Subject"); // Enter text in a textbox
	
			WebElement predefinedCountries = driver.findElement(By.id("q9"));
			Select list = new Select(predefinedCountries);
			Thread.sleep(1000);
			list.selectByIndex(0); // Selects the first item from the dropdown
			Thread.sleep(1000);
			list.selectByIndex(1); // Selects the first item from the dropdown
			Thread.sleep(1000);
			list.selectByIndex(3); // Selects the first item from the dropdown
			Thread.sleep(1000);
			list.selectByVisibleText("Bhutan");
			List<WebElement> options = list.getOptions();
			System.out.println("No of pre-defined countries found are : " + options.size());
			
			for (WebElement option : options) {
				System.out.println(option.getText());
			}
			Thread.sleep(3000);
			list.selectByIndex(options.size()-2);
			System.out.println("First selected option is : " + list.getFirstSelectedOption().getText());
			
			test.log(LogStatus.PASS, "Successfully performed actions on all types of objects");
		} catch (Exception e) {
			//String x = e.printStackTrace();
			test.log(LogStatus.FAIL, "Failed to perform actions on all types of objects since : " +e.getMessage());
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
