package com.am.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.am.qa.base.TestBase;
import com.am.qa.pages.HomePage;

public class HomePage extends TestBase{

	@FindBy(id="twotabsearchtextbox")
	WebElement searchbox;
	
	@FindBy(id="nav-search-submit-button")
	WebElement searchbutton;
	
	
	@FindBy(xpath = "//img[@alt='DALUCI Non Woven Fabric Disposable Face Mask With Nose Clip (Blue, Without Valve,Pack Of 100) For Unisex']")

	WebElement prodbtn;
	
	//Initializing the page objects
	public HomePage() throws Exception{
		PageFactory.initElements(driver, this);
	}
	
	public String validateHomePageTitle() {
		return driver.getTitle();
		
	}
	public ItemSelected Searchitem(String se) throws Exception 
	{
	
	searchbox.sendKeys(se);
	searchbutton.click();
	
	Thread.sleep(5000);
	prodbtn.click();
	
	
	return new ItemSelected();
}

	
	
}
