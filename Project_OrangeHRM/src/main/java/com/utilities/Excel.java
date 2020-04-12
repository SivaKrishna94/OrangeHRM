package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel {
		
	//To read and return username
	
	public  String excel_username() throws IOException {
		  
		System.out.println("caame here");
		  FileInputStream fil = new FileInputStream(new File("C:\\Users\\dhana\\Documents\\Book1.xlsx"));
		  XSSFWorkbook workbook = new XSSFWorkbook(fil);
		  XSSFSheet sheet=workbook.getSheet("Sheet1");
		  int count=sheet.getLastRowNum();
		  System.out.println(count);
		    
			  XSSFRow row =sheet.getRow(1);
			  XSSFCell cell=row.getCell(0);
			 String un=cell.getStringCellValue();
			  System.out.println(un);
			return un;
			     
}
	//TO read and return password
	public  String excel_password(int b) throws IOException {
		  
		  FileInputStream fil = new FileInputStream(new File("C:\\Users\\dhana\\Documents\\Book1.xlsx"));
		  XSSFWorkbook workbook = new XSSFWorkbook(fil);
		  XSSFSheet sheet=workbook.getSheet("Sheet1");
		  int count=sheet.getLastRowNum();
		  System.out.println(count);
		  
			  XSSFRow row =sheet.getRow(b);
			  XSSFCell cell1=row.getCell(1);
			  String pwd=cell1.getStringCellValue();
			  System.out.println(pwd);
		return pwd;
}
}
