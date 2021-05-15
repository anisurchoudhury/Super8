package com.codepractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithoutSelect {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
		driver.get("https://www.yahoo.com/");

		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		
List<WebElement>list=driver.findElements(By.xpath("//ul[@role='presentation']//li"));

System.out.println(list.size());

for(int i=0;i<list.size();i++) {
	String s=list.get(i).getText();
	System.out.println(s);
	if(s.contentEquals("News")) {
		list.get(i).click();
	}
}


	}

}
