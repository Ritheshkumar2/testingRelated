package utilstwo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ExcelRelated {
	
	public static Object[][] gettestdata(String filepath,String sheetname) throws IOException {
		
		Object[][] data = null;
		
		FileInputStream fis=new FileInputStream(filepath);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet(sheetname);
		
		int rowCount=sheet.getPhysicalNumberOfRows();
		int colCount=sheet.getRow(0).getPhysicalNumberOfCells();
		
		data=new Object[rowCount-1][colCount];
		
		for(int i=1;i<rowCount;i++) {
			Row row=sheet.getRow(i);
			for(int j=0;j<colCount;j++) {
				Cell cell=row.getCell(j);
				data[i-1][j]=cell.toString();
			}
		}
		workbook.close();
		fis.close();
		
		return data;
		
	}

}
