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

public class WebTableTest {

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
    public void webTableMethods() throws InterruptedException {
       	try {
			driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
			driver.manage().window().maximize(); // maximize the browser window
			List<WebElement> columns = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
			WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']"));		
			for(WebElement column : columns) {
				System.out.println(column.getText());
			}
			
			int nColumns = columns.size(); // Column Count
			System.out.println("Column count is : " + nColumns);
			List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
			int nRows = rows.size();
			System.out.println("Row count is : " + nRows);
			boolean blnFound = false;
			
			for (int i = 1; i <=nRows; i++) {
				for(int j=1;j<=nColumns;j++) {
					String cellText = table.findElement(By.xpath("tbody/tr["+i+"]/td["+j+"]")).getText();
					System.out.print(cellText + " ");
					if(cellText.equals("Cigniti Technologies")) {
						blnFound=true;
						break;
					}
				}
				System.out.println();
				if (blnFound) {
					break;
				}
				
			}
			test.log(LogStatus.PASS, "Successfully performed all the methods on webtable");
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Failed to perform methods on webtable since : " +e.getMessage());
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
