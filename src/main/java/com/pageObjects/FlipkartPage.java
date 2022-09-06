package com.pageObjects;

import org.openqa.selenium.By;

public class FlipkartPage {
	
	By topOffers = By.xpath("//*[text()='Top Offers']");
	By electronics = By.xpath("//*[text()='Electronics']");
	By grocery = By.xpath("//*[text()='Grocery']");
	By ElectronicsChevron = By.xpath("//div[text()='Electronics']/*[local-name()='svg']");
}
