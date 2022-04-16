package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LocatorsExample {

    WebDriver driver;

    @BeforeClass
    public void accessSite(){
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.mycontactform.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void locatorsMethods(){
        WebElement username = driver.findElement(By.id("user"));
        System.out.println(username.getAttribute("name"));
        System.out.println(username.getAttribute("class"));
        System.out.println(username.getAttribute("tabindex"));
        System.out.println(username.getAttribute("id"));
        System.out.println(username.getTagName());
        username.sendKeys("Mounika");
        System.out.println("Value entered in username field is : " + username.getAttribute("value"));
        Assert.assertEquals(username.getAttribute("value"), "mounika", "Username is not valid");
    }

    @AfterClass
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }
}
