package com.codepractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserBase {

	public WebDriver driver;
	@Parameters("Browser")
    @BeforeTest
	public void getBrowser(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
         driver.get("https://www.amazon.com/");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
         
	}
    @AfterTest
    public void tearDown() {
    	driver.close();
    	driver.quit();
    }
}
