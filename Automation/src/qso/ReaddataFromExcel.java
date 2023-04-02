package qso;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReaddataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./test/pp.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
	    String value = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
	    System.out.println(value);
		
	}

}
