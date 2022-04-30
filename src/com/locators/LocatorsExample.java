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

import java.util.List;

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

        //boolean bFlag = driver.findElement(By.cssSelector("h5:contains('Business')")).isDisplayed();
        //System.out.println("Business forms object display status is : " +bFlag);

        // Absolute path using CSS
        driver.findElement(By.cssSelector("html>body>div:nth-child(3)>div:nth-child(2)" +
                ">div>form>fieldset>div>input")).clear();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("html>body>div:nth-child(3)>div:nth-child(2)" +
                ">div>form>fieldset>div>input")).sendKeys("srilatha");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div:nth-child(2)" +
                ">div>form>fieldset>div>input")).clear();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div:nth-child(2)" +
                ">div>form>fieldset>div>input")).sendKeys("akhila");



        // XPath - Absolute xpath
        WebElement sub = driver.findElement(By.xpath("/html/body/div[3]/div[3]/form/table/tbody/tr[2]/td/input"));
        sub.clear();
        sub.sendKeys("mounika@gmail.com");

        // XPath - Relative xpath
        WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
        email.clear();
        email.sendKeys("mounika@gmail.com");

        // XPath - and Operator
        WebElement subj = driver.findElement(By.xpath("//input[@id='subject' and @name='subject']"));
        subj.clear();
        subj.sendKeys("Test Subject123");
        Thread.sleep(2000);

        // XPath - or Operator
        WebElement subje = driver.findElement(By.xpath("//input[@id='subject' or @name='subject']"));
        //WebElement subje = driver.findElement(By.xpath("//input[@id='shashikala']|//input[@name='subject']"));
        subje.clear();
        subje.sendKeys("Test Subject12345");
        Thread.sleep(2000);

        // XPath - starts-with
        WebElement subjec = driver.findElement(By.xpath("//input[starts-with(@id,'sub')]"));
        subjec.clear();
        subjec.sendKeys("Subject123");
        Thread.sleep(2000);

        // XPath - contains
        WebElement endssub = driver.findElement(By.xpath("//input[contains(@id,'subj')]"));
        endssub.clear();
        endssub.sendKeys("Subject12345");
        Thread.sleep(2000);

        // XPath - contains text()
        WebElement business = driver.findElement(By.xpath("//h5[contains(text(),'Business Forms')]"));
        System.out.println(business.isDisplayed());
        String url = "";
        List<WebElement> businessforms = driver.findElements(By.xpath("//h5[contains(text(),'Business Forms')]/following::ul[1]/li"));
        for(WebElement link : businessforms){
            System.out.println(link.getText());
        }


    }

    @Test(priority = 2)
    public void login(){
        homepage = new Homepage(driver);
        sampleforms = new SampleForms(driver);
        homepage.enterUsername("naresh");
        homepage.enterPassword("Secure*1234");
        homepage.clickLogin();
        //homepage.clickSampleForm();
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
