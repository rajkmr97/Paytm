package com.sat.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sat.qa.base.TestBase;
import com.sat.qa.pages.HomeAppliancesPage;
import com.sat.qa.pages.HomePage;
import com.sat.qa.pages.LoginPage;

public class HomePageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	HomeAppliancesPage homeAppliancesPage;
	
	public HomePageTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialize();
		homeAppliancesPage=new HomeAppliancesPage();
		loginPage=new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Test(priority=1)
	public void verifyHomePageTitleTest() {
		String homePageTitle=homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "", "Home page title not matched");
	}
	@Test(priority=2)
	public void verifyUserNameTest() {
		Assert.assertTrue(homePage.verifyCorrectUserName());
	}
	@Test(priority=3)
	public void verifyHomeAppliancesLinkTest() {
		homeAppliancesPage=homePage.clickOnHomeAppliancesLink();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
