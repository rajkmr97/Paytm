package com.sat.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sat.qa.base.TestBase;
import com.sat.qa.pages.HomePage;
import com.sat.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();
	}
	
	 
	@BeforeTest
	public void setUp() {
		initialize();
		loginPage=new LoginPage();
	}

	@Test(priority=1)
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPage();
		Assert.assertEquals(title, "", "Login page title not matched");
	}
	
	@Test(priority=2)
	public void logoImageTest() {
		boolean flag = loginPage.validateLogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void loginTest() {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
