package com.locators;

import com.object.repository.Homepage;
import com.object.repository.SampleForms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.List;

public class Test {

    static  WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.mycontactform.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='user']/following::input[1]")).sendKeys("triveni");

        List<WebElement> links = driver.findElements(By.tagName("a"));
        for(WebElement link:links){
            System.out.println(link.getText());
        }

        Thread.sleep(4000);
        driver.quit();
    }
}
