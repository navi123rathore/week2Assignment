package com.pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseclass.TestBase;

public class GooglePage extends TestBase {
	

	By searchBox = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input");	
	By searchBtn =  By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]");
	

	public void enterSearchBox(String text) {		
	 driver.findElement(searchBox).sendKeys(text);
	}
	
	public void clickSearchbtn() {		
		driver.findElement(searchBtn).click();
	}

}
