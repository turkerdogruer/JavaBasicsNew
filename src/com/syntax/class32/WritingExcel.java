package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcel {
	public static void main(String[] args) throws IOException {

		String path = System.getProperty("user.dir") + "";

		// System.out.println(path);
		FileInputStream fis = new FileInputStream(path);
		Workbook wbook = new XSSFWorkbook(fis);

		// Sheet sheet = wbook.getSheet("Sheet1");
		// sheet.createRow(0).createCell(0).setCellValue("First Name");
		Sheet sheet = wbook.createSheet("TestSheet");
		sheet.createRow(0).createCell(0).setCellValue("First Name");
		sheet.getRow(0).createCell(1).setCellValue("Last Name");
		sheet.getRow(0).createCell(2).setCellValue("Phone Number");
		FileOutputStream fos = new FileOutputStream(path);
		wbook.write(fos);
	}

}
