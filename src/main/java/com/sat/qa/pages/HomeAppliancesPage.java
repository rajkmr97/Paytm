package com.sat.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sat.qa.base.TestBase;

public class HomeAppliancesPage extends TestBase{

	@FindBy(xpath="//title[contains(text(),'Home Appliances Online Shopping in India')]")
	WebElement homeAppliancesLabel;
	@FindBy(xpath="//a[@title='Show products in category Air Conditioner']")
	WebElement airConditioner;
	@FindBy(xpath="//a[@title='Split AC']")
	WebElement splitAC;
	@FindBy(xpath="//a[@title='LG AC 1Ton KSQ12PWZD Inverter 5 Star']")
	WebElement ACClick;
	@FindBy(xpath="//div[@class='col flex-grow-1']")
	WebElement cartBtn;

	
	@FindBy(id = "NewAddress_FirstName")
	WebElement firstName;
	@FindBy(id = "NewAddress_LastName")
	WebElement lastName;
	@FindBy(id = "NewAddress_Address1")
	WebElement address;
	@FindBy(id = "NewAddress_City")
	WebElement city;
	@FindBy(id = "NewAddress_ZipPostalCode")
	WebElement zipCode;
	@FindBy(id = "NewAddress_Email")
	WebElement emailId;
	@FindBy(id = "NewAddress_PhoneNumber")
	WebElement phone;
	@FindBy(xpath = "(//span[@class='select2-selection select2-selection--single'])[1]")
	WebElement country;
	@FindBy(xpath = "//li[@class='select2-results__option']")
	WebElement India;
	
	
	@FindBy(xpath = "//button[@class='btn btn-warning btn-lg new-address-next-step-button']")
	WebElement nextBtn;
	@FindBy(xpath = "//button[@class='btn btn-warning btn-block select-shipping-address-button']")
	WebElement shippingAddr;
	@FindBy(xpath = "//button[@class='btn btn-warning btn-lg shipping-method-next-step-button']")
	WebElement nextNxtBtn;
	@FindBy(xpath = "//button[@class='btn btn-warning btn-lg payment-method-next-step-button']")
	WebElement nextBtnNxt;
	
	
	
	
	public HomeAppliancesPage() {
		PageFactory.initElements(driver, this);
	}
		
	public void selectHomeAppliances() {
		//driver.findElement(By.xpath("//a[@title='Show products in category Air Conditioner']")).click();
		airConditioner.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		splitAC.click();
		driver.manage	().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Actions builder = new Actions(driver);
		ACClick.click();
		cartBtn.click();		
	}
	
	public void CheckOutBtnLink(String firstname, String lastname, String addr, String cityname, String zip,
			String email, String phoneno) {
		firstName.sendKeys(firstname);
		lastName.sendKeys(lastname);
		address.sendKeys(addr);
		city.sendKeys(cityname);
		zipCode.sendKeys(zip);
		emailId.sendKeys(email);
		phone.sendKeys(phoneno);
		country.click();
		India.click();
		nextBtn.click();
		shippingAddr.click();
		nextNxtBtn.click();
		nextBtnNxt.click();
		}
}


