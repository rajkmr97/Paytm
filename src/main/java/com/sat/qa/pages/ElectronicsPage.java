package com.sat.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sat.qa.base.TestBase;

public class ElectronicsPage extends TestBase{
	
	
	@FindBy(xpath="//*[@title='Desktop' and @href='/desktop']")
	WebElement desktop;
	
	@FindBy(xpath="//span[text()='ASUS TUF Gaming FX10CP-Ci7 8700-8GB DDR4-1TB7 SATA-WIN10-GTX1050 2G']")
	WebElement productClk;
	
	@FindBy(xpath="//a[@data-type='cart' and @data-action='add']")
	WebElement AddCartBtn;
	
	@FindBy(xpath="//a[@class='btn btn-success btn-flat btn-flat-light btn-block btn-action']")
	WebElement goCartBtn;
	
	@FindBy(xpath="//button[@class='btn btn-danger btn-lg btn-block btn-checkout']")
	WebElement checkout;
	
	
	public ElectronicsPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public void selectElectronics() {
		//driver.findElement(By.xpath("//a[@title='Show products in category Air Conditioner']")).click();
		desktop.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		Actions builder = new Actions(driver);
		productClk.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		AddCartBtn.click();
		goCartBtn.click();
		checkout.click();
	}
	
	
	
	

}
