package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsTest {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.mycontactform.com/");
        driver.manage().window().maximize();
        driver.navigate().to("https://www.mycontactform.com/samples.php");

        // Locators
        // Absolute xpath starts from root or parent node of the html DOM
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/form/fieldset/div[1]/input")).sendKeys("Shashikala");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/form/fieldset/div[1]/input")).clear();
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/form/table/tbody/tr[2]/td/input")).sendKeys("Test Subject");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/form/table/tbody/tr[2]/td/input")).clear();
        driver.findElement(By.xpath("//tbody/tr[2]/td/input")).sendKeys("Test Subject123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//tbody/tr[2]/td/input")).clear();

        // XPath with Attributes or Relative XPath
        // Syntax : //html tag[@attribute='value']
        driver.findElement(By.xpath("//input[@id='subject']")).sendKeys("Test Subject..!");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='subject']")).clear();
        driver.findElement(By.xpath("//input[@id='email' and @type='email']")).sendKeys("Test Email");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='email' and @type='email']")).clear();
        driver.findElement(By.xpath("//input[@id='email' or @type='sadhashiv']")).sendKeys("sadhashiva@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='email' or @type='sadhashiv']")).clear();
        driver.findElement(By.xpath("//input[@id='email' ] |//input[@name='email']")).sendKeys("sadhashiva@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='email' ] |//input[@name='email']")).clear();
        driver.findElement(By.xpath("//input[starts-with(@id,'ema')]")).sendKeys("abhilash@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[starts-with(@id,'ema')]")).clear();
        driver.findElement(By.xpath("//input[contains(@id,'ema')]")).sendKeys("naresh@gmail.com");
        Thread.sleep(2000);
        String emailaddress = driver.findElement(By.xpath("//input[starts-with(@id,'ema')]")).getAttribute("value");
        System.out.println(emailaddress);
        Assert.assertEquals(emailaddress, "naresh@gmail.com", "Email address entered is not correct");
        driver.findElement(By.xpath("//input[contains(@id,'ema')]")).clear();

        driver.quit();
    }


}
