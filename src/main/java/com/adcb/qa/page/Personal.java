package com.adcb.qa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adcb.qa.base.BasePage;

public class Personal extends BasePage {

	@FindBy(xpath="//label[@class='menu-bar']")
	WebElement menu;
	
	@FindBy(xpath="//a[@aria-label='Business']")
	WebElement business;
	
	public Personal(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	public String getWebPageTitle()
	{
		return driver.getTitle();
	}
	
	public void clickOnMenu()
	{
		menu.click();
	}
	public void clickOnBusiness()
	{
		business.click();
	}

}
