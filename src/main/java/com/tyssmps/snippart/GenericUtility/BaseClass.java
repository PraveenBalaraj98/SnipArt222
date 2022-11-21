package com.tyssmps.snippart.GenericUtility;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver driver;
	DataBaseUtility dlib=new DataBaseUtility();
	ExcelUtility elib=new ExcelUtility();
	FileUtility flib=new FileUtility();
	JavaUtility jlib=new JavaUtility();
	WebDriverUtility wlib=new WebDriverUtility();
	
	@BeforeSuite
	
		public void connectToDatabase() throws SQLException
		{
			dlib.ConnectToDataBase();
		}
	@BeforeClass
	public void configBC() throws Throwable {
		System.out.println("=============Launch the Browser=======");
		String BROWSER = flib.getPropertyKeyValue("browser");
		if(BROWSER.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if (BROWSER.equalsIgnoreCase("firefox")) {			
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else {
			System.out.println("INCORRECT BROWSER");
		} 

		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}	
    @AfterSuite()
    public void closeDatabase() throws SQLException
    
    {
    	dlib.closeDb();
    }
}
