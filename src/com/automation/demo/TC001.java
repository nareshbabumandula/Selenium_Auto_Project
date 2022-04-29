package com.automation.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class TC001 {

    static WebDriver driver;

    public static void main(String[] args) {
           System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
           driver = new ChromeDriver();
           driver.get("https://www.eseye.com/");
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
           driver.findElement(By.linkText("Login")).click();
           String logintitle = driver.findElement(By.xpath("//h3[contains(text(),'Account login')]")).getText();
           Assert.assertEquals(logintitle, "Account login123", "Login page title is incorrect");
           driver.close();
    }

}
