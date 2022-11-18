package com.tyssmps.snippart.GenericUtility;

import java.io.FileInputStream;
import java.util.Properties;


/**
 * @author Praveen
 *
 */
public class FileUtility {
	public String getPropertyKeyValue(String key) throws Throwable {
		
		FileInputStream fis = new FileInputStream(IConstants.filepath);
		Properties pObj = new Properties();
		pObj.load(fis);
		String value = pObj.getProperty(key);
		return value;
		
	}
}
