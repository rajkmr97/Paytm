package com.sat.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sat.qa.base.TestBase;
import com.sat.qa.pages.ElectronicsPage;
import com.sat.qa.pages.HomeAppliancesPage;
import com.sat.qa.pages.HomePage;
import com.sat.qa.pages.LoginPage;

public class ElectronicsPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	ElectronicsPage electronicsPage;
	
	public ElectronicsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialize();
		electronicsPage=new ElectronicsPage();
		//loginPage=new LoginPage();
		//homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		electronicsPage=homePage.clickOnElectronicsLink();
	}
	
	
	
	@Test(priority=1)
	public void selectHomeAppliancesTest() {
		electronicsPage.selectElectronics();
	}
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
