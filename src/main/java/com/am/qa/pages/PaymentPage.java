package com.am.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.am.qa.base.TestBase;

public class PaymentPage extends TestBase {

@FindBy(xpath="//input[@name='addCreditCardVerificationNumber1']")
	WebElement cvvbtn;

@FindBy(xpath="//input[@name='ppw-widgetEvent:SetPaymentPlanSelectContinueEvent'][1]")
WebElement fcontbtn;

public PaymentPage() {
	PageFactory.initElements(driver, this);
}

public String validatePageTitle() {
	return driver.getTitle();
}

public DummyPage finalstep() {
	cvvbtn.sendKeys("999");
	fcontbtn.click();
	
	return new DummyPage();
	
}


}


