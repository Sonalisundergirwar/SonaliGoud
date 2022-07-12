package exelExample;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class StaticExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile= new File("D:\\SELENIUM\\ExcelExample\\Sheet1.xlsx");
          Workbook book = WorkbookFactory.create(myfile);
          Sheet Sheet = book.getSheet("Sheet1");
                      Row Row = Sheet.getRow(0);
                     Cell cell = Row.getCell(3);
                     System.out.println("========================================");
                     
                     //code for reading data from excel sheet
                    org.apache.poi.ss.usermodel.Sheet Sheet2 = book.getSheet("Sheet2");
                    for(int i=0;i<=1;i++) 
                    {
                    	for(int j=0;j<=2;j++) {
                    		String value = Sheet2.getRow(i).getCell(j).getStringCellValue();
                    		System.out.print(value+" ");
                    	}
                    
                    System.out.println();
                    }
	}
	

}
