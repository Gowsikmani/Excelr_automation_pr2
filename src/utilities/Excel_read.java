package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_read {
	
	public List<Map<String,String>> Excel_value() throws IOException
	{
		List<Map<String,String>> row_value = new ArrayList<Map<String,String>>();
		
		FileInputStream fis = new FileInputStream("test");
		XSSFWorkbook Wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh = Wb.getSheet("data");
		int lastrownum = sh.getLastRowNum();
		
		for(int row=0;row<=lastrownum;row++)
		{
			XSSFRow r = sh.getRow(row);
			int lastcellnum = r.getLastCellNum();
			
			LinkedHashMap<String,String> Columndata = new LinkedHashMap<String,String>();
			
			for(int cell=0;cell<=lastcellnum;cell++)
			{
				XSSFCell c = r.getCell(cell);
				
				String currentcolumnname = sh.getRow(sh.getFirstRowNum()).getCell(cell).getStringCellValue();
				Columndata.put(currentcolumnname, c.getStringCellValue());
			}
			row_value.add(Columndata);
		}
		return row_value;
		
	}
	
	

}
