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

public class LocatorsTest {

	WebDriver driver;

	ExtentReports reports;
	ExtentTest test;

	@BeforeClass
	public void launchBrowser(){
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		reports = new ExtentReports(System.getProperty("user.dir") +"\\Extent Reports\\Automation Results.html", true);
		test = reports.startTest("Locators Test");
	}

	@Test
	public void textboxMethods() throws InterruptedException {
		String err_Msg;
		try {
			driver.get("https://www.mycontactform.com/");
			driver.manage().window().maximize(); // maximize the browser window
			// Absolute Xpath  - Starts from root or parent node
			driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/form/fieldset/div/input")).sendKeys("Akhila");
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/form/fieldset/div/input")).clear();
			// Relative Xpath  - Starts from the node of our choice
			driver.findElement(By.xpath("//form/fieldset/div/input")).sendKeys("Sai");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//form/fieldset/div/input")).clear();

			// Relative xpath with attributes
			driver.findElement(By.xpath("//input[@name='user']")).sendKeys("Vignath");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='user']")).clear();

			// Relative xpath with starts-with and attributes
			driver.findElement(By.xpath("//input[starts-with(@name,'use')]")).sendKeys("Amar");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='user']")).clear();

			// Relative xpath with contains and attributes
			driver.findElement(By.xpath("//input[contains(@name,'use')]")).sendKeys("Siva");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[contains(@name,'use')]")).clear();

			// CSS Locator - Cascading Style Sheet with absolute path
			driver.findElement(By.cssSelector("html>body>div:nth-of-type(3)>div:nth-of-type(2)>div>form>fieldset>div>input")).sendKeys("Anil");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("html>body>div:nth-of-type(3)>div:nth-of-type(2)>div>form>fieldset>div>input")).clear();
			// CSS Locator - Relative path
			driver.findElement(By.cssSelector("form>fieldset>div>input")).sendKeys("Naresh");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("form>fieldset>div>input")).clear();

			// CSS with starts-with (^) and attributes
			driver.findElement(By.cssSelector("input[id^='use']")).sendKeys("Maanasa");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[id^='use']")).clear();

			// CSS with ends-with ($) and attributes
			driver.findElement(By.cssSelector("input[id$='ser']")).sendKeys("Srujana");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[id$='ser']")).clear();

			// Relative xpath with contains (*) and attributes
			driver.findElement(By.cssSelector("input[id*='ser']")).sendKeys("Akhil");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[id*='ser']")).clear();

			// CSS with # as a replacement for ID locator
			driver.findElement(By.cssSelector("input#user")).sendKeys("Vijay");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input#user")).clear();

			// CSS with . as a replacement for classname locator
			driver.findElement(By.cssSelector("input.txt_log")).sendKeys("Guru");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input.txt_log")).clear();

			// Using ID locator
			driver.findElement(By.id("user")).sendKeys("Kiran");
			Thread.sleep(2000);
			driver.findElement(By.id("user")).clear();

			// Using Name locator
			driver.findElement(By.name("pass")).sendKeys("Secure*1234");
			Thread.sleep(2000);
			driver.findElement(By.name("pass")).clear();

			// Using LinkText locator
			driver.findElement(By.linkText("Sample Forms")).click();
			Thread.sleep(2000);

			// Using LinkText locator
			driver.findElement(By.partialLinkText("Resour")).click();
			Thread.sleep(2000);

			// Using Class name locator
			driver.findElement(By.className("txt_log")).sendKeys("Rajesh");
			Thread.sleep(2000);
			driver.findElement(By.className("txt_log")).clear();

			// Using tag name locator
			driver.findElement(By.tagName("input")).sendKeys("Yogesh");
			Thread.sleep(2000);
			driver.findElement(By.tagName("input")).clear();



			test.log(LogStatus.PASS, "Successfully used all the available locators in Selenium");
		} catch (Exception e) {
			//String x = e.printStackTrace();
			test.log(LogStatus.FAIL, "Failed to use all the locators in Selenium since : " +e.getMessage());
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
