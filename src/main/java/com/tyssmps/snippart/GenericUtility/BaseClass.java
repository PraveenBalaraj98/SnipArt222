package com.tyssmps.snippart.GenericUtility;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.tyssmps.snippart.ObjectRepository.HomePage;
import com.tyssmps.snippart.ObjectRepository.RegistrationPage;
import com.tyssmps.snippart.ObjectRepository.WelcomePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	public DataBaseUtility dlib=new DataBaseUtility();
	public ExcelUtility elib=new ExcelUtility();
	public FileUtility flib=new FileUtility();
	public JavaUtility jlib=new JavaUtility();
	public WebDriverUtility wlib=new WebDriverUtility();
	public HomePage hLib=new HomePage(driver);
	public RegistrationPage rLib=new RegistrationPage(driver);
	public WelcomePage wLib=new WelcomePage(driver);
	
	@BeforeSuite
	
		public void connectToDatabase() throws SQLException
		{
			dlib.ConnectToDataBase();
		}
	@BeforeClass
	public void BrowserLaunch()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(IConstants.ProjectUrl);
	}
	@BeforeMethod
	public void Login()
	{
		
	}
   @AfterMethod
   public void logout()
   {
	   
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
