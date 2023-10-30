package com.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.custom.listeners.HighlightingListener;
import com.object.repository.Loginpage;
import com.object.repository.SampleFormspage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleForms {

	WebDriver driver;
	Loginpage lp;

	ExtentReports reports;
	ExtentTest test;

	@BeforeClass
	public void launchBrowser() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		// Create an EventFiringWebDriver instance with your WebDriver
        EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);

        // Create an instance of your custom listener
        HighlightingListener highlightingListener = new HighlightingListener();

        // Register the listener with the EventFiringWebDriver
        eventDriver.register(highlightingListener);
        eventDriver.get("https://jqueryui.com/autocomplete/");
        eventDriver.findElement(By.linkText("Draggable"));
        Thread.sleep(3000);
 		reports = new ExtentReports(System.getProperty("user.dir") +"\\Extent Reports\\Automation Results.html", true);
		test = reports.startTest("Locators Test");
	}

	@Test
	public void submitSampleForm() throws InterruptedException {
		long startTime = System.currentTimeMillis();
		SampleFormspage sp = new SampleFormspage(driver);
		System.out.println("Execution started at : " + (System.currentTimeMillis()-startTime) +" ms");
		String err_Msg;
		try {
			driver.navigate().to("https://www.mycontactform.com/");
			driver.manage().window().maximize(); // maximize the browser window
			// Scripting with Page Object Model
			driver.findElement(lp.username).sendKeys("Sai");
			driver.findElement(lp.password).sendKeys("Secure1234");
			sp.clickSampleForms(); // Click on Sample Forms
			sp.selectDepartment(sp.chkMarketingDepartment); // Select Marketing Department
			sp.selectDepartment(sp.chkCustomerService);
			sp.selectDepartment(sp.chkSales);
			driver.findElement(By.xpath("html/body/div[3]/div[3]/form/table/tbody/tr[2]/td/input")).sendKeys("Locators");
			driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("abc@gmail.com");
			driver.findElement(By.cssSelector("input[name^='q1']")).sendKeys("Fit");
			driver.findElement(By.cssSelector("textarea[name^='q2'] ")).sendKeys("Practice");
			driver.findElement(By.cssSelector("input[value^='Fir']")).click();
			driver.findElement(By.cssSelector("input[value^='Sec']")).click();
			driver.findElement(By.cssSelector("input[value^='Thi']")).click();
			driver.findElement(By.cssSelector("input[value^='Fou']")).click();
			driver.findElement(By.cssSelector("input[value^='Fif']")).click();
			driver.findElement(By.cssSelector("input[name^='q5']")).click();
			
			driver.findElement(sp.firstoption).click();
			
			driver.findElement(By.cssSelector("input[name^='che'][value^='Seco']")).click();
			driver.findElement(By.cssSelector("input[name^='che'][value^='Thi']")).click();
			driver.findElement(By.cssSelector("input[name^='che'][value^='Fou']")).click();
			driver.findElement(By.cssSelector("input[name^='che'][value^='Fif']")).click();
			driver.findElement(By.cssSelector("select[name*='q8']")).sendKeys("CA");
			driver.findElement(By.cssSelector("select[name*='q9']")).sendKeys("India");
			driver.findElement(By.cssSelector("select[name*='q10']")).sendKeys("Ontario");
			driver.findElement(By.cssSelector("select[name*='q11']")).sendKeys("Mr.");
			driver.findElement(By.cssSelector("input[placeholder*='Fir']")).sendKeys("ABC");
			driver.findElement(By.cssSelector("input[placeholder*='Las']")).sendKeys("XYZ");
			driver.findElement(By.cssSelector("select[name*='q12']")).sendKeys("3");
			driver.findElement(By.cssSelector("select[name$='day']")).sendKeys("23");
			driver.findElement(By.cssSelector("select[name$='ear']")).sendKeys("1935");
			driver.findElement(By.cssSelector("input[name*='visver_code']")).sendKeys("123");
			driver.findElement(By.cssSelector("input[name*='submit']")).click();
			test.log(LogStatus.PASS, "Successfully filled the SampleForm");
			System.out.println("Execution end at : " + (System.currentTimeMillis()-startTime) +" ms");
		} catch (Exception e) {
			//String x = e.printStackTrace();
			test.log(LogStatus.FAIL, "Failed to fill the SampleForm since : " +e.getMessage());
			e.printStackTrace();
		}
	}

	@AfterClass
	public void closeBrowser() throws InterruptedException {
		driver.quit(); //tear down operation
		reports.endTest(test);
		reports.flush();
	}
}
