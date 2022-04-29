package com.object.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SampleForms {

    WebDriver driver;

    // Page Factory pattern for declaring the web elements
    @FindBy(className="topbullet")
    WebElement sampleFormsHeading;

    public SampleForms(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public String verifySampleFormsHeading() {
        String strHeading  =sampleFormsHeading.getText();
        return strHeading;
    }


}
