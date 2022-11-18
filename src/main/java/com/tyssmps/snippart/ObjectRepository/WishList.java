package com.tyssmps.snippart.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WishList {
	
	public WebDriver driver;
	public WishList(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
}
