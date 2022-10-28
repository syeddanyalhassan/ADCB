package com.adcb.qa.page;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adcb.qa.base.BasePage;
import com.google.inject.Key;

public class Personal extends BasePage {

	@FindBy(xpath="//label[@class='menu-bar']")
	WebElement menu;

	@FindBy(xpath="//a[@aria-label='Business']")
	WebElement business;

	@FindBy(xpath="//a[@class='c-quick-links__link icon-search js-toggleSearchBox']")
	WebElement searchicon;
	
	@FindBy(xpath="//input[@placeholder='I am looking for...']")
	WebElement searchtext;
	
	@FindBy(xpath="//p[@id='searchCount']")
	WebElement searchcount;
	
	public Personal(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public String getWebPageTitle()
	{
		return driver.getTitle();
	}

	public  void clickOnMenu()
	{
		menu.click();
	}
	public  void clickOnBusiness()
	{
		business.click();
	}
	
	public void clickonSearch()
	{
		searchicon.click();
	}
	
	public void searchText()
	{
		searchtext.sendKeys("Test");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		searchtext.sendKeys(Keys.ENTER);
	}
	
	public String searchCount()
	{
		return searchcount.getText();
	}

}
