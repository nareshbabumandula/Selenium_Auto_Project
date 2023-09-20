package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.valuelabs.com/resources/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[contains(text(),'Read Now')]")).click();
        Thread.sleep(4000);
        driver.quit();
    }
}
