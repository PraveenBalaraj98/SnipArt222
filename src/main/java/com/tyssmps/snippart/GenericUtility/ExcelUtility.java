package com.tyssmps.snippart.GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	/*
	 *  to get the string data from excel
	 */
	public String getExcelStringData(String sheetName,int rowNum,int CellNum) throws EncryptedDocumentException, IOException
	{
   FileInputStream fis =new FileInputStream(IConstants.Exelpath);
   Workbook book = WorkbookFactory.create(fis);
   Sheet sh = book.getSheet(sheetName);
   Row row = sh.getRow(rowNum);
   String data = row.getCell(CellNum).getStringCellValue();
       return data;
	
	}
	
	/*
	 * to get the numeric data from excel
	 */
	
	public double getExcelNumericData(String sheetName, int rowNum, int cellNum) throws Throwable {
		FileInputStream fis = new FileInputStream(IConstants.Exelpath);
		Workbook book =	WorkbookFactory.create(fis);
		Sheet sh =  book.getSheet(sheetName);
		Row r = sh.getRow(rowNum);
		double data = r.getCell(cellNum).getNumericCellValue();
		return data;
		
	}
	
	
	
	public void StroreToExcel(String sheetName,int RowNum,int celNum,String value ) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis =new FileInputStream(IConstants.Exelpath);
		   Workbook book = WorkbookFactory.create(fis);
		   Sheet sh = book.getSheet(sheetName);
		   Cell cel = sh.createRow(RowNum).createCell(celNum);
		   cel.setCellValue(value);
		   FileOutputStream fout =new FileOutputStream(".\\Data Properties\\TestData-Snippart team.xlsx");
		   book.write(fout);
	}

}
