package KiteWithPOM;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass
{
	//excel
	//screenshot
	//closing
	public static String readDataFromExcel(int row, int cell)  throws EncryptedDocumentException, IOException
	{
	File myfile= new File("D:\\\\SELENIUM\\\\ExcelExample\\\\Sheet1.xlsx");
	Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet4");
	String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
	return value;
	}
}
