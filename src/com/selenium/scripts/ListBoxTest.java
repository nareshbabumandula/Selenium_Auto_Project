package com.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class ListBoxTest {

    WebDriver driver;

    @BeforeClass
    public void launchBrowser(){
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void listboxMethods() throws InterruptedException {
        driver.get("https://www.mycontactform.com/samples.php");
        driver.manage().window().maximize(); // maximize the browser window
        //System.out.println("Element : " + driver.findElement(By.id("q99")));
        WebElement predefinedCountries = driver.findElement(By.id("q9"));
        Select country = new Select(predefinedCountries);
        System.out.println(country.getFirstSelectedOption());
        System.out.println(country.getAllSelectedOptions());
        System.out.println(country.isMultiple());
        System.out.println(predefinedCountries.isSelected());
        System.out.println(predefinedCountries.isDisplayed());
        System.out.println(predefinedCountries.isEnabled());
        country.selectByIndex(0);
        Thread.sleep(2000);
        country.selectByIndex(1);
        Thread.sleep(2000);
        country.selectByIndex(2);
        Thread.sleep(2000);
        country.selectByVisibleText("India");

        List<WebElement> countries = predefinedCountries.findElements(By.tagName("option"));
        // Lambda expression to get the list of elements/items stored in a dropdown listbox
        countries.forEach(ele-> System.out.println(ele.getText()));
        System.out.println("No of elements found in the pre-defined countries dropdown are  : " + countries.size());

    }

    @AfterClass
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }


}
