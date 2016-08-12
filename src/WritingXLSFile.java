import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WritingXLSFile {
	public static void main(String args[]) throws FileNotFoundException, IOException
	{
		HSSFWorkbook ws = new HSSFWorkbook();
		HSSFSheet sheet = ws.createSheet("Roopa_data");
		HSSFRow row = sheet.createRow(0);
		HSSFCell cell = row.createCell(0);
		cell.setCellValue("1.Cell");
		ws.write(new FileOutputStream("excel.xls") );
				
	}
}
