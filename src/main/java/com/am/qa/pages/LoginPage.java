package com.am.qa.pages;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.am.qa.base.TestBase;
import com.am.qa.util.ExcelUtility;

public class LoginPage extends TestBase{
	
	@FindBy(xpath="//input[@type='email']")
	WebElement ebtn;
	@FindBy(id="continue")
	WebElement contbtn;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement pbtn;
	@FindBy(id="signInSubmit")
	WebElement sgnbtn;
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validatePageTitle() {
		return driver.getTitle();
	}
	
	public PaymentPage afterlogin() throws IOException {
		Map<String,String>testData =ExcelUtility.getMap();
		//ebtn.sendKeys("reachtogeorgemathew@gmail.com");
		ebtn.sendKeys(testData.get("username"));
		contbtn.click();
		pbtn.sendKeys("godhod123321");
		sgnbtn.click();
		return new PaymentPage();
		
	}
	
	

}
