package generic;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {

	public String getexceldata(String file, String sheet, int row, int cell)
	{
		String s = "";
		try {
			FileInputStream f = new FileInputStream (file);
			Workbook w = WorkbookFactory.create(f);
			s= w.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
						
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
		return s;
	}
	
}
