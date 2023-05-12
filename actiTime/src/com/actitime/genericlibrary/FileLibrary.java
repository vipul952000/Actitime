package com.actitime.genericlibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This is generic library class which contains all the generic methods.
 * @author Vipul
 *
 */


public class FileLibrary {
	/**
	 * This is a generic method which is used to  read the data from property file.
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String ReadDatafromPropertyFile(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./Test Data/commondata.property");
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
		
	}
	/**
	 * This is a generic method which is used to read the data from the Exel sheet.
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @return
	 * @throws IOException 
	 * @throws EncryptedDocumentException
	 * @Throws IOException
	 */
	public String ReadTheDataFromExcelFile(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis1 = new FileInputStream("./Test Data/Test Data.xlsx");
		Workbook wb = WorkbookFactory.create(fis1);
		String value = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return value;
		
		
	}
	

}
