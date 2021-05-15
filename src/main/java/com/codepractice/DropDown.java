package com.codepractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown extends CrossBrowserBase {
public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");

		
	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		Select sc=new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
		sc.selectByVisibleText("Amazon Warehouse");
		
		List<WebElement>list=sc.getOptions();
		System.out.println(list.size());
		for(int a=0;a<list.size();a++) {
		String s=list.get(a).getText();
		System.out.println(s);
			
			}
	
	
	}

}
