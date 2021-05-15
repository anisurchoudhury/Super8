package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {
public WebDriver driver;
	
public CreateAccountPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
		
}
@FindBy(xpath="//span[contains(text(),'Hello, Sign in')]")
WebElement signin;
public void getSignin() {
	signin.click();

}
@FindBy(xpath="//a[@id='createAccountSubmit']")
WebElement ClickOnCreateButton;
public void getClickOnCreateButton() {
	ClickOnCreateButton.click();

}
@FindBy(xpath="//input[@id='ap_customer_name']")
WebElement EnterFullName;
public void getEnterFullName() {
	
}
@FindBy(xpath="//input[@id='ap_email']")
WebElement EnterEmail;
public void getEnterEmail() {
}
@FindBy(xpath="//input[@id='ap_password']")
WebElement EnterPassword;
public void getEnterPassword() {
}
@FindBy(xpath="//input[@id='ap_password_check']")
WebElement ReEnterPassword;
public void getReEnterPassword() {
}
@FindBy(xpath="//input[@id='continue']")
WebElement ClickOnCreateAmazonAccount;
public void getClickOnCreateAmazonAccount() {
}

}





