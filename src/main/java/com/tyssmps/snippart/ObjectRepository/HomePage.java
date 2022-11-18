package com.tyssmps.snippart.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.thoughtworks.qdox.model.expression.And;

public class HomePage {
	
	/**
	 * @author SaiPrasad 
	 * This POM class contains all the home elements 
	 * */
	
	
	public WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	

	@FindAll({ @FindBy(name = "search"), @FindBy(xpath = "//input[@name='search' and  @type='text']") })
	private WebElement searchTextFeild;
	@FindBy(linkText = "Desktops")
	private WebElement DesktopsBtn;
	@FindAll({ @FindBy(xpath = "//button[@data-original-title='Add to Wish List']") })
	private WebElement macWishListBtn;
	@FindBy(linkText = "Mac (1)")
	private WebElement Mac1Btn;
	@FindBy(id = "wishlist-total")
	private WebElement wishlistBtn;
	@FindBy(linkText = "iMac")
	private WebElement totalWishishList;

	public WebElement getSearchTextFeild() {
		return searchTextFeild;
	}

	public WebElement getDesktopsBtn() {
		return DesktopsBtn;
	}

	public WebElement getMacWishListBtn() {
		return macWishListBtn;
	}

	public WebElement getMacBtn() {
		return Mac1Btn;
	}

	public WebElement getWishlistBtn() {
		return wishlistBtn;
	}

	public WebElement getTotalWishishList() {
		return totalWishishList;
	}

	public String addProductToWitshList() {
		
		DesktopsBtn.click();
		Mac1Btn.click();
		macWishListBtn.click();
		String text = totalWishishList.getText();
		return text;
	}

}
