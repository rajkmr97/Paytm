package com.sat.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sat.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	
	@FindBy(xpath="//span[text()='Log in']")
	WebElement lgnBtn;
	
	@FindBy(xpath="//input[@type= 'email']")
	WebElement email;
	
	@FindBy(xpath="//input[@type= 'password']")
	WebElement password;
	
	@FindBy(xpath="//button[@class= 'btn btn-primary btn-lg btn-block btn-login']")
	WebElement loginBtn;
	
	@FindBy(xpath="//a[@class= 'btn btn-warning btn-lg btn-block register-button']")
	WebElement register;
	
	@FindBy(xpath="//img[@class= 'img-fluid']")
	WebElement logo;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String validateLoginPage() {
		return driver.getTitle();
	}
	
	public boolean validateLogo() {
		return logo.isDisplayed();
	}
	
	public HomePage login(String un, String pwd) {
		lgnBtn.click();
		email.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage();
		
	}
	
	
	

}
