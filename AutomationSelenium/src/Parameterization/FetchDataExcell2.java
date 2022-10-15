 package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataExcell2 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream file = new FileInputStream("C:\\Users\\patil\\OneDrive\\Desktop\\Book1.xlsx");
	double data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getNumericCellValue();
	
	Cell rowCount= WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0);
	
	for (int i = 0; i<= rowCount; i++) {
		
		int cellCount = WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getLastCellNum();  
		for(int j = 0; j<= cellCount - 1; j++) {
			
			
			if (c.equals(CellType.BOOLEAN)) {
				c.getBooleanCellValue();
			} else if (c.equals(CellType.NUMERIC)) {
				
			}
			
		}
	}
	
}
}

