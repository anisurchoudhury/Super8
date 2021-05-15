package com.codepractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {
	
    public static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement source=	driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	//WebElement charity=driver.findElement(By.linkText("AmazonSmile Charity Lists"));

	WebElement target=	driver.findElement(By.xpath("(//span[contains(text(),'Orders')])[2]"));
	Actions ac=new Actions(driver);
	ac.moveToElement(source).moveToElement(target).click().build().perform();
		
	//Screenshot v=new Screenshot();
	//v.scShot(driver, "a");
	Screenshot.scShot(driver,"b");
		
		
		
		
		
	}

}
