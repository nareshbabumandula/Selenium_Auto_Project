package com.application.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class BrowserTest {

    WebDriver driver;

    // Method - User defined method it will be stored in the stack memory
    public void launchBrowser(String strBrowser) throws InterruptedException {

        switch (strBrowser){

            case "chrome":
                System.setProperty("webdriver.chrome.driver", "drivers" + File.separator + "chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "edge":
                System.setProperty("webdriver.edge.driver", "drivers" + File.separator + "msedgedriver.exe");
                driver = new EdgeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "drivers" + File.separator + "geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("Invalid browser");
        }

        driver.get("https://www.mycontactform.com/");
        driver.manage().window().maximize(); // Maximizing the browser window
        driver.findElement(By.id("username")).sendKeys("Radhika");
        driver.findElement(By.id("pass")).sendKeys("Secure*12");
        Thread.sleep(3000);
        driver.quit();
    }


    public static void main(String[] args) throws InterruptedException {

        // Create an object reference for the class
        // Classname objRef = new Constructor();
        BrowserTest bt = new BrowserTest();
        bt.launchBrowser("edge");


    }


}
