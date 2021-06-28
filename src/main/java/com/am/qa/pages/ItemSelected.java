package com.am.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.am.qa.base.TestBase;

public class ItemSelected extends TestBase {

	@FindBy(xpath="//input[@id='buy-now-button']")
	WebElement buyBtn;
	
	
	
	
	public ItemSelected() {
		PageFactory.initElements(driver, this);
	}
	
	
	


	public String validatePageTitle() {
		return driver.getTitle();
	}
	
	/*public String validateItemPrice() {
		String prices = price.getText().toString();
		return prices;
	}
	public PaymentPage buynow() {
		 buybtn.click();
		
		return new PaymentPage();
	}
*/
	
	public LoginPage logintobuy() {
		buyBtn.click();
		return new LoginPage();
		
	}
}
