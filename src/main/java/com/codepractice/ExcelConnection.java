package com.codepractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelConnection {

	public static void main(String[] args) throws Throwable, InvalidFormatException, IOException {
	FileInputStream fis=new FileInputStream("./ExcelData/Excel Connection.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet("Sheet1");
	String s=sh.getRow(1).getCell(1).getStringCellValue();
	System.out.println(s);
	
	
	
	
	

	}

}
