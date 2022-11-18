package com.tyssmps.snippart.GenericUtility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IRetryAnalyzer;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnersImplimentation implements ITestListener {
	
	public void ontestFailure(ITestResult result) throws Throwable {
		
		 
		System.out.println("=======> Execute & i am Listner <======");
		JavaUtility jLib=new JavaUtility();
	//	String date = jLib.getSystemDate();
	//	int RanNum=jLib.getRanDomNum(899); 
		String testName = result.getMethod().getMethodName();
       // EventFiringWebDriver ef=new EventFiringWebDriver(BaseClass.sdriver);
//		TakesScreenshot t= (TakesScreenshot) BaseClass.sdriver;
//		File src = t.getScreenshotAs(OutputType.FILE);
//		try{
//			FileUtils.copyFile(src,new File("./screenshot/"+testName+date+RanNum+".png"));
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
	}
}
