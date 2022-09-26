package Org.Amsys.Util;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;;


//"F:\\Softwares\\Stud\\Eclipse\\Enow_QA_data_stg.xls"

public class Excelread {
	
	public static Workbook book;
	public static  Sheet sheet;

	
	public static Object[][] getTestData(String sheetName) throws InvalidFormatException {
		FileInputStream file = null;
		try {
			file = new FileInputStream("F:\\Softwares\\Stud\\Eclipse\\Enow_QA_data_stg.xls");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Workbook book = WorkbookFactory.create(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	      sheet=book.getSheet(sheetName);
	
	
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		// System.out.println(sheet.getLastRowNum() + "--------" +
		// sheet.getRow(0).getLastCellNum());
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				 System.out.println(data[i][k]);
			}
		}
		return data;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		getTestData("Bagadbilla");
	
}

}
