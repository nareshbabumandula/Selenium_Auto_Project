package com.selenium.scripts;

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

public class TextboxTest {

    WebDriver driver;
    
    ExtentReports reports;
	ExtentTest test;

    @BeforeClass
    public void launchBrowser(){
    	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
    	driver = new ChromeDriver();
    	reports = new ExtentReports(System.getProperty("user.dir") +"\\Extent Reports\\Automation Results.html", true);
		test = reports.startTest("Textbox Test");
    }

    @Test
    public void textboxMethods() throws InterruptedException {
    	String err_Msg;
    	try {
			driver.get("https://www.mycontactform.com/");
			driver.manage().window().maximize(); // maximize the browser window
			WebElement username = driver.findElement(By.id("user"));
			System.out.println(username.getAttribute("name"));
			System.out.println(username.getAttribute("type"));
			System.out.println(username.getAttribute("id"));
			System.out.println(username.getAttribute("class"));
			System.out.println(username.getAttribute("tabindex"));
			System.out.println(username.isDisplayed());
			System.out.println(username.isEnabled());
			System.out.println(username.getAttribute("value"));
			String valuebefore = username.getAttribute("value");
			System.out.println(valuebefore.isEmpty());
			username.sendKeys("naresh223"); // enter data into the textbox
			String valueafter = username.getAttribute("value");
			System.out.println(valueafter.isEmpty() + "-" + valueafter);
			Assert.assertEquals(valueafter, "naresh223", "Expected value is not matching with the actual value");
			username.clear(); // clears the text from the text field
			username.sendKeys();
			test.log(LogStatus.PASS, "Successfully validated and entered text in a textbox");
		} catch (Exception e) {
			//String x = e.printStackTrace();
			test.log(LogStatus.FAIL, "Failed to perform validations on textbox since : " +e.getMessage());
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
