package com.tyssmps.snippart.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement ele1;
	
	
	
	
	/**
	 * @param drver
	 */
	public void  Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
}
