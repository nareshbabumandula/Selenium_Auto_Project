package com.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class HandleMutipleWindowsTest {

    WebDriver driver;

    @BeforeClass
    public void launchBrowser(){
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void handleMutipleWindows() throws InterruptedException {
        driver.get("https://www.mycontactform.com/");
        driver.manage().window().maximize(); // maximize the browser window
        String mainwindow = driver.getWindowHandle();
        System.out.println(mainwindow);
        String newTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
        driver.findElement(By.linkText("Sample Forms")).sendKeys(newTab);
        Set<String> windows = driver.getWindowHandles();
        System.out.println(windows);

        Iterator<String> iter = windows.iterator();
        while (iter.hasNext()){
            driver.switchTo().window(iter.next());
            String sessionID = driver.getWindowHandle();
            if (!(sessionID.equals(mainwindow))) {
                driver.switchTo().window(sessionID);
                driver.findElement(By.id("subject")).sendKeys("Test Subject");
            }

        }
        driver.switchTo().window(mainwindow);
        driver.findElement(By.id("user")).sendKeys("testuser123");

    }

    @AfterClass
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(4000);
        driver.close();
        Thread.sleep(4000);
        driver.quit();
    }


}
