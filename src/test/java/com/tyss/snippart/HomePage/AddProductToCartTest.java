package com.tyss.snippart.HomePage;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.tyssmps.snippart.GenericUtility.BaseClass;

public class AddProductToCartTest extends BaseClass{
	
	@Test
	public void addProductToWishListTest() {
		
		String expText="iMac";
		//  Login as user click, 
	rLib.registerNewUser("Saiprasad", "Munagala", "munagalasaiprasad16@gmail.com", "8309320783", "saiprasad8309320753", "saiprasad8309320753");
	System.out.println("Login Successfull");
	//add the product in to wish list
	String text = hLib.addProductToWitshList();
	Assert.assertEquals(text, expText);
	Reporter.log(text, true);
	}
}
