package com.am.qa.testcases;

import java.util.ArrayList;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.am.qa.base.TestBase;
import com.am.qa.pages.DummyPage;
import com.am.qa.pages.HomePage;
import com.am.qa.pages.ItemSelected;
import com.am.qa.pages.LoginPage;
import com.am.qa.pages.PaymentPage;

public class PaymentPageTest extends TestBase {
	
	HomePage homePage;
	ItemSelected itemSelected;
	LoginPage loginPage;
	PaymentPage paymentPage;
	DummyPage dummyPage;
	
	public PaymentPageTest() {
		super();
	}
	
	@BeforeMethod
	@BeforeTest
	public void setUp() throws Exception {
		initialization();
		homePage=new HomePage();
		itemSelected=homePage.Searchitem("mask");
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTb.get(1));
		loginPage = itemSelected.logintobuy();
		paymentPage = loginPage.afterlogin();
	}
	
	
	@Test
	public void finalizing() {
		dummyPage = paymentPage.finalstep();
	}
	
	
	
	

	@AfterMethod
	@AfterTest
	public void tearDown() {
		//driver.quit();
	}
	
	
	
	
	
	

}
