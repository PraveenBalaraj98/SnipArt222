package com.tyssmps.snippart.GenericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReTryImpClass implements IRetryAnalyzer{
	
	int counter=0;
	int retrylimit=4;
	public boolean retry(ITestResult result) {
		
		if(counter<retrylimit) {
			counter++;
		}
		return false;
	}
	
	// Qualified name : (com.tyssmps.snippart.GenericUtility.IRetryAnalyzer.class)

}