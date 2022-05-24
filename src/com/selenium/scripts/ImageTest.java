package com.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ImageTest {

    WebDriver driver;

    @BeforeClass
    public void launchBrowser(){
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void imageMethods() throws InterruptedException {
        driver.get("https://www.mycontactform.com/");
        driver.manage().window().maximize(); // maximize the browser window
        WebElement imageLogo = driver.findElement(By.className("test_img"));
        System.out.println(imageLogo.isEnabled());
        System.out.println(imageLogo.isDisplayed());
        System.out.println(imageLogo.isSelected());
        System.out.println(imageLogo.getAttribute("src"));
        imageLogo.click(); // click on image
    }

    @AfterClass
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }


}
