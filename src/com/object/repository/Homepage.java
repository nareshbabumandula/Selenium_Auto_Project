package com.object.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

    WebDriver driver;

    // Page Factory pattern for declaring the web elements
    @FindBy(id="user")
    WebElement username;

    @FindBy(id="pass")
    WebElement password;

    @FindBy(name="btnSubmit")
    WebElement login;

    @FindBy(how=How.LINK_TEXT, using = "Sample Forms")
    WebElement SampleForms;

    public Homepage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    // Re-usable methods
    public void enterUsername(String strusername){
        username.sendKeys(strusername);
    }

    public void enterPassword(String strPassword){
        password.sendKeys(strPassword);
    }

    public void clickLogin() {
        login.click();
    }

    public void clickSampleForm() {
        SampleForms.click();
    }


}
