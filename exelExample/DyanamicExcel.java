package exelExample;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DyanamicExcel {

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile= new File("D:\\SELENIUM\\ExcelExample\\Sheet1.xlsx");
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
		int totalNoOfRows = mySheet.getLastRowNum();
		int Row = totalNoOfRows;
		System.out.println("Total no of rows are    "+Row);
		short TotalNoOfCell = mySheet.getRow(Row).getLastCellNum();
		int Cell =TotalNoOfCell-1;
		System.out.println("Total no of cells are   "+Cell);
		for(int i=0;i<=Row;i++) 
		{
			for(int j=0;j<=Cell;j++) 
			{
				 Cell Cellvalue = mySheet.getRow(i).getCell(j);
		CellType datatype = Cellvalue.getCellType();
			if(datatype==CellType.STRING) 
			{
				String value = Cellvalue.getStringCellValue();
				System.out.print(value+" ");
			}
			else if(datatype==CellType.NUMERIC)
			{
				double value = Cellvalue.getNumericCellValue();
				System.out.print(value+" ");
			}
			else if(datatype==CellType.BOOLEAN) 
			{
				boolean value = Cellvalue.getBooleanCellValue();
				System.out.print(value+" ");
			}
			else if(datatype==CellType.BLANK) 
			{
				//org.apache.poi.ss.usermodel.Row value = Cellvalue.getRow();
				System.out.print(" ");
			}
           }
		    System.out.println();
		}
	}
	}

