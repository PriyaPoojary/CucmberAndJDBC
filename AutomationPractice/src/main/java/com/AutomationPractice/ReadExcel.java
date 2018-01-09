package com.AutomationPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;

public class ReadExcel {

	public String getValueFromExcel(String excelKey) {
		Workbook workbook = null;
		try {
			FileInputStream inputStream = new FileInputStream(
					new File(System.getProperty("user.dir") + "/src/main/resources/TestData/Data.xls"));
			workbook = new HSSFWorkbook(inputStream);
			HSSFSheet sheet = (HSSFSheet) workbook.getSheetAt(0);
			DataFormatter formatter = new DataFormatter();
			ArrayList<String> keys = new ArrayList<>();
			ArrayList<String> values = new ArrayList<>();
			HashMap<String, String> map = new HashMap<>();

			for (int i = 0; i <= sheet.getLastRowNum(); i++) {
				String key;
				String value;
				key = formatter.formatCellValue(sheet.getRow(i).getCell(0));
				value = formatter.formatCellValue(sheet.getRow(i).getCell(1));
				keys.add(key);
				values.add(value);
				map.put(keys.get(i), values.get(i));
			}
			return map.get(excelKey);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				workbook.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		return null;
	}

}
