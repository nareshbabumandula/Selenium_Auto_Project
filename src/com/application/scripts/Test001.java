package com.application.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test001 {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.mycontactform.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("")).sendKeys("abc");
        driver.findElement(By.id("user")).sendKeys("ramesh123");
        driver.findElement(By.id("pass")).sendKeys("Secure*12324");
        driver.findElement(By.name("btnSubmit")).click();
        Thread.sleep(5000);
        driver.quit();

    }
}
