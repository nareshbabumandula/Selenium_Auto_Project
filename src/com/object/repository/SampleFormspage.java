package com.object.repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SampleFormspage {

	WebDriver driver;
	
	// Page Object Model - Design Pattern
	// Page Object
	public static By firstoption = By.cssSelector("input[name^='che'][value^='Firs']");
    
	
	// Page Factory Object
	@FindBy(linkText = "Sample Forms")
	private WebElement lnkSampleForms;
	
	@FindBy(xpath = "//table/tbody/tr/td/div/input")
	public WebElement chkMarketingDepartment;
	
	@FindBy(css = "input[value^='1']")
	public WebElement chkSales;
	
	@FindBy(css = "input[value^='2']")
	public WebElement chkCustomerService;
		
	public void clickSampleForms() {
		lnkSampleForms.click();
	}
	
	public void selectDepartment(WebElement department) {
		department.click();
	}
		
	public SampleFormspage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
}
