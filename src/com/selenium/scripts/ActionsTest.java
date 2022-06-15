package com.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Actions class in Selenium is primarily used to simulate input actions from mouse and keyboard on specific
 * web elements (For eg: Left click, Right click, Double click, etc)
 */
public class ActionsTest {

    WebDriver driver;

    @BeforeClass
    public void launchBrowser(){
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void actionsMethods() throws InterruptedException {
        driver.get("https://www.copart.com/");
        driver.manage().window().maximize(); // maximize the browser window
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement sellVehicle = driver.findElement(By.linkText("Sell a Vehicle"));
        Actions action = new Actions(driver);
        action.moveToElement(sellVehicle).perform();
        driver.findElement(By.linkText("For Dealers")).click();

        WebElement btnSearch = driver.findElement(By.xpath("//button[contains(text(),'Search Inventory')]"));
        action.contextClick(btnSearch).perform();

        driver.navigate().to("https://jqueryui.com/");
        driver.findElement(By.linkText("Draggable")).click();
        driver.switchTo().frame(0); // Switch into the frame
        //driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        WebElement dragMeAround = driver.findElement(By.xpath("//p[contains(text(),'Drag me around')]"));
        action.dragAndDropBy(dragMeAround, 290, 140).perform();
        driver.switchTo().defaultContent(); // Switch out from the frame
        driver.findElement(By.linkText("Droppable")).click();
        driver.switchTo().frame(0); // Switch into the frame
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement dest = driver.findElement(By.id("droppable"));
        action.dragAndDrop(source, dest).perform();

    }

    @AfterClass
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }


}
