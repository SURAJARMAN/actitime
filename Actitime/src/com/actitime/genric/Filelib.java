package com.actitime.genric;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Filelib {
	public String getProperty(String key) throws IOException  {
		FileInputStream fis=new FileInputStream("./data/common.property");
		Properties p=new Properties();
		p.load(fis);
		String data	=p.getProperty(key);
		return data;
	}

	public String xlFile(String page,int row,int cell) throws EncryptedDocumentException, IOException  {
		
		FileInputStream fis=new FileInputStream("./data/testdata.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		
		String text = wb.getSheet(page).getRow(row).getCell(cell).getStringCellValue();
		return text;
	}
}
