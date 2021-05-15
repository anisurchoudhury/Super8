package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.common.Base;
import com.pageobjectmodel.CreateAccountPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateNewAccountSteps extends Base {
	CreateAccountPage pm;
	

	@Given("^I am on Amazon Web Page$")
	public void i_am_on_Amazon_Web_Page() throws Throwable {
		getBrowser();
	   pm=PageFactory.initElements(driver, CreateAccountPage.class);
	}

	@When("^I click sign in button$")
	public void i_click_sign_in_button() throws Throwable {
	  // driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]")).click();
	   pm.getSignin();
	}

	@When("^I click on Create your Amazon Account Button$")
	public void i_click_on_Create_your_Amazon_Account_Button() throws Throwable {
	   //driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
	   pm.getClickOnCreateButton();
	}

	@Then("^I enter Full name$")
	public void i_enter_Full_name() throws Throwable {
	   //driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Anisur R Choudhury");
	   pm.getEnterFullName();
	}

	@Then("^I enter Email$")
	public void i_enter_Email() throws Throwable {
	   //driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("anisurchoudhury87.it@gmail.com");
	   pm.getEnterEmail();
	}

	@Then("^I enter Password$")
	public void i_enter_Password() throws Throwable {
	   //driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("12345678");
	   pm.getEnterPassword();
	}

	@Then("^I reenter Password$")
	public void i_reenter_Password() throws Throwable {
	   //driver.findElement(By.xpath("//input[@id='ap_password_check']")).sendKeys("12345678");
	   pm.getReEnterPassword();
	}

	@Then("^I click on Create your Amazon account button$")
	public void i_click_on_Create_your_Amazon_account_button() throws Throwable {
	   //driver.findElement(By.xpath("//input[@id='continue']")).click();
	   pm.getClickOnCreateAmazonAccount();
	}

	@Then("^I find a message that says your Amazon account is created successfully\\.$")
	public void i_find_a_message_that_says_your_Amazon_account_is_created_successfully() throws Throwable {
	   Assert.assertEquals(driver.getTitle(),"Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
	   
	}

	
	
	
	
	
	
	
	
	
	
	
}
