package com.sat.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sat.qa.base.TestBase;

public class HomePage extends TestBase{
	@FindBy(xpath="//span[@title='vinodh682@gmail.com']")
	WebElement userNameLabel;
	@FindBy(xpath="//a[contains(text(),'Home Appliances')]")
	WebElement homeAppliancesLink;
	@FindBy(xpath="//a[contains(text(),'Audio')]")
	WebElement audioLink;
	@FindBy(xpath="//a[contains(text(),'Electronics')]")
	WebElement electronicsLink;
	@FindBy(xpath="//a[contains(text(),'Security')]")
	WebElement securityLink;
		
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
		
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyCorrectUserName() {
		return userNameLabel.isDisplayed();
	}
	
	public HomeAppliancesPage clickOnHomeAppliancesLink() {
		homeAppliancesLink.click();
		return new  HomeAppliancesPage();
	}
	
	public ElectronicsPage clickOnElectronicsLink() {
		electronicsLink.click();
		return new  ElectronicsPage();
	}
}
