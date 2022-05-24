package com.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ButtonTest {

    WebDriver driver;

    @BeforeClass
    public void launchBrowser(){
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void butttonMethods() throws InterruptedException {
        driver.get("https://www.mycontactform.com/");
        driver.manage().window().maximize(); // maximize the browser window
        WebElement submit = driver.findElement(By.name("btnSubmit"));
        System.out.println(submit.isEnabled());
        System.out.println(submit.isDisplayed());
        System.out.println(submit.isSelected());
        submit.click(); // click on Submit button
    }

    @AfterClass
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }


}
