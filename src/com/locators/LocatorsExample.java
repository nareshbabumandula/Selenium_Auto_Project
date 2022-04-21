package com.locators;

import com.object.repository.Homepage;
import com.object.repository.SampleForms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LocatorsExample {

    WebDriver driver;
    Homepage homepage;
    SampleForms sampleforms;

    @BeforeClass
    public void accessSite(){
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.mycontactform.com/");
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void locatorsMethods() throws InterruptedException {

        // ID Locator
        WebElement username = driver.findElement(By.id("user")); // Hardcoding
        //WebElement username = driver.findElement(homepage);
        System.out.println(username.getAttribute("name"));
        System.out.println(username.getAttribute("class"));
        System.out.println(username.getAttribute("tabindex"));
        System.out.println(username.getAttribute("id"));
        System.out.println(username.getTagName());
        username.sendKeys("Mounika");
        System.out.println("Value entered in username field is : " + username.getAttribute("value"));
        Assert.assertEquals(username.getAttribute("value"), "Mounika", "Username is not valid");

        // Name locator
        WebElement password = driver.findElement(By.name("pass"));
        System.out.println(password.getTagName());
        System.out.println(password.getAttribute("name"));
        System.out.println(password.getAttribute("type"));
        System.out.println(password.getAttribute("class"));
        System.out.println(password.getAttribute("is"));
        System.out.println(password.getAttribute("tabindex"));
        password.sendKeys("Secure*1234");

        // Classname
        WebElement login = driver.findElement(By.className("btn_log"));
        login.click();

        // Linktext
        WebElement features = driver.findElement(By.linkText("Features"));
        features.click();

        // Partial Linktext
        WebElement pricing = driver.findElement(By.partialLinkText("Pric"));
        pricing.click();

        // CSS - Cascading Style Sheet
        WebElement sampleForms = driver.findElement(By.linkText("Sample Forms"));
        sampleForms.click();
        WebElement subject = driver.findElement(By.cssSelector("input[id='subject']"));
        subject.sendKeys("Test Subject");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#email")).sendKeys("naresh223@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input.btn_log")).click();
        // CSS starts-with
        driver.findElement(By.cssSelector("input[value^='First Op']")).click();
        Thread.sleep(2000);
        // CSS ends-with
        driver.findElement(By.cssSelector("input[value$='cond Option']")).click();
        Thread.sleep(2000);
        // CSS contains
        driver.findElement(By.cssSelector("input[value*='Third']")).click();
        Thread.sleep(2000);


    }

    @Test(priority = 2)
    public void login(){
        homepage = new Homepage(driver);
        sampleforms = new SampleForms(driver);
        homepage.enterUsername("naresh");
        homepage.enterPassword("Secure*1234");
        homepage.clickLogin();
        homepage.clickSampleForm();
        // Checkpoint or assertion
        String heading = sampleforms.verifySampleFormsHeading();
        Assert.assertEquals(heading, "Sample Email and Contact Forms", "Sample Forms page heading is not correct");

    }


    @AfterClass
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }
}
