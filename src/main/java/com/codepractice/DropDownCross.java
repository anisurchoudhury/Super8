package com.codepractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownCross extends CrossBrowserBase {
@Test
	public void testingDrop() {
		
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
