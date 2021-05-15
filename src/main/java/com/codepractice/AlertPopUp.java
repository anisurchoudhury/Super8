package com.codepractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUp {

	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345678");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		driver.switchTo().alert().accept();

		System.out.println(driver.switchTo().alert().getText());
		// Alert alert=driver.switchTo().alert();
		// javascriptExecutor v=(JavascriptExecutor)driver;
		// v.executeScript(script,args);

	}

}
