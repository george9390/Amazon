package com.am.qa.testcases;

import java.io.IOException;
import java.util.Map;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.am.qa.base.TestBase;
import com.am.qa.pages.HomePage;
import com.am.qa.pages.ItemSelected;
import com.am.qa.util.ExcelUtility;


public class HomePageTest extends TestBase {
	
	
	HomePage homePage;
	ItemSelected itemSelected;
	

	public HomePageTest() throws Exception  {
	
	super();
	}
	
	@BeforeMethod
	public void setup() throws Exception  {
	initialization();
	
	homePage=new HomePage();
	
	
	}
	
	
	@Test
	public void homePageTitleTest(){
		log.debug("Page Title Verification");
		String title=homePage.validateHomePageTitle();
		System.out.println(title);
	}
	
	/*@Test(priority=2)
	public void itemSearchclick() throws InterruptedException, IOException {
		Thread.sleep(4000);
		log.debug("Items searching and selecting");
		Map<String,String>testData =ExcelUtility.getMap();
		itemSelected = homePage.searchItemandClick(testData.get("itemtosearch"));
		
	}
	*/
	@Test
	public void itemsearch() throws Exception  {
		
		itemSelected=homePage.Searchitem("mask");
	}
	
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	
	
	
}

