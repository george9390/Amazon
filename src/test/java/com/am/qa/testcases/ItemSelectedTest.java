package com.am.qa.testcases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.am.qa.base.TestBase;
import com.am.qa.pages.HomePage;
import com.am.qa.pages.ItemSelected;
import com.am.qa.pages.LoginPage;


public class ItemSelectedTest extends TestBase{
	
	
	HomePage homePage;
	ItemSelected itemSelected;
	LoginPage loginPage;

	

	
	public ItemSelectedTest() {
		super();
	}
	


	
	@BeforeTest
	public void setUp() throws Exception {
		initialization();
		homePage=new HomePage();
		itemSelected=homePage.Searchitem("mask");
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTb.get(1));
		
	}
	
	@Test(priority=0)
	public void verifyItemPageTitle() {
		String Itemtitle = itemSelected.validatePageTitle();
		Assert.assertEquals(Itemtitle, "DALUCI Non Woven Fabric Disposable Face Mask With Nose Clip (Blue, Without Valve, Pack of 100) For Unisex: Amazon.in: Clothing & Accessories");
	}
	
	@Test(priority=1)
	public void clicktoBuyitem() {
		loginPage = itemSelected.logintobuy();
	}
	
	
	
	

	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
