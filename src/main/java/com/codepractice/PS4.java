package com.codepractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class PS4 {
	public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");

		
		driver.manage().window().maximize();
	 	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("ps4");

		List<WebElement>list=driver.findElements(By.xpath("//div[@id='suggestions']//div"));
		
		for(int i=0;i<list.size();i++) {
			
			
		list.get(0).click();
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
	}

}
