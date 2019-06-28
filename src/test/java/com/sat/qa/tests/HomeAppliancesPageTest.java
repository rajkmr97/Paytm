package com.sat.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sat.qa.base.TestBase;
import com.sat.qa.pages.HomeAppliancesPage;
import com.sat.qa.pages.HomePage;
import com.sat.qa.pages.LoginPage;

public class HomeAppliancesPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	HomeAppliancesPage homeAppliancesPage;
	
	public HomeAppliancesPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialize();
		homeAppliancesPage=new HomeAppliancesPage();
		loginPage=new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		homeAppliancesPage=homePage.clickOnHomeAppliancesLink();
	}
	
	@Test(priority=1)
	public void selectHomeAppliancesTest() {
		homeAppliancesPage.selectHomeAppliances();
		homeAppliancesPage.CheckOutBtnLink("Ram", "Kumar", "Kamarajar Road", "Chennai", "600020", "ramkmrshiv@gmail.com", "9988776655");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
