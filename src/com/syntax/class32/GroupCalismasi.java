package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GroupCalismasi {
	public static void main(String[] args) throws IOException {
		String path = "/Users/funda/eclipse-workspace/JavaBasicsNew/Testdata/GroupInfo.xlsx";
		
		FileInputStream fis =new FileInputStream(path);
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet("Sheet1");
		
		
		System.out.println( sheet.getRow(5).getCell(4).toString()+" "+sheet.getRow(5).getCell(6).toString());
	
	
	
	}
}
