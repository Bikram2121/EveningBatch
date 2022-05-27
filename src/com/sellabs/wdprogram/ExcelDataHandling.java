/**
 * 
 */
package com.sellabs.wdprogram;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/** 
 * @author Vikram
 *
 */
public class ExcelDataHandling {

	@Test(dataProvider = "datasource-1")
	public void Execution(String a, String b, String c) {
		int val1 = Integer.parseInt(a);
		int val2 = Integer.parseInt(b);
		int val3 = Integer.parseInt(c);
		System.out.println(val1 + val2 + val3);
	}

	@DataProvider(name = "datasource-1")
	public Object[][] fetchExcelData() throws BiffException, IOException {
		Workbook wb = Workbook.getWorkbook(new File(System.getProperty("user.dir") + "\\data.xls"));
		Sheet sh = wb.getSheet("datasheet");
		int rows = sh.getRows();
		int columns = sh.getColumns();
		String data[][] = new String[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				Cell c = sh.getCell(j, i);
				data[i][j] = c.getContents();
				// System.out.print(data[i][j] + "\t");

			}
		}
		return data;
	}
}
