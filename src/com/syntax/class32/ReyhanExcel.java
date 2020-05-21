package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReyhanExcel {
	public static void main(String[] args) throws Exception {

		String path1 = "/Users/funda/eclipse-workspace/JavaBasicsNew/Testdata/GroupInfo.xlsx";

		FileInputStream fis = new FileInputStream(path1);

		Workbook book1 = new XSSFWorkbook(fis);

		Sheet sheet1 = book1.getSheet("Sheet1");

		int rows = sheet1.getPhysicalNumberOfRows();
		int cols = sheet1.getRow(0).getLastCellNum();

		List<Map<String, String>> mapList = new ArrayList<>();

		for (int r = 1; r < rows; r++) {

			Map<String, String> map = new LinkedHashMap<>();

			for (int c = 0; c < cols; c++) {

				String key = sheet1.getRow(0).getCell(c).toString();
				String value = sheet1.getRow(r).getCell(c).toString();
				map.put(key, value);

			}
			mapList.add(map);
		}
		System.out.println(mapList);

	}
}