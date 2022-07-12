package exelExample;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exel1 {

	

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile= new File("D:\\SELENIUM\\ExcelExample\\Sheet1.xlsx");
				// Using WorkBookFactory class read excel sheet
				// how to read String value
				String name =WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
				System.out.println(name);
				// how to read numeric value
				double number =WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();
				System.out.println(number);
				// how to read char value
				String mychar =WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
				System.out.println(mychar);
				//how to read boolean value
				boolean myValue =WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(1).getBooleanCellValue();
				System.out.println(myValue);
	            double no1=WorkbookFactory.create(myfile).getSheet("sheet1").getRow(2).getCell(1).getNumericCellValue();
	            System.out.println(no1);
	            String name1=WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(2).getStringCellValue();
	            System.out.println(name1);
	            double no2=WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(3).getCell(2).getNumericCellValue();
	            System.out.println(no2);
	            boolean myValue1 =WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(3).getCell(3).getBooleanCellValue();
				System.out.println(myValue);
				String mychar1=WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(4).getCell(3).getStringCellValue();
				System.out.println(mychar);

	}

}
