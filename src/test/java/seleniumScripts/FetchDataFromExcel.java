package seleniumScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import com.github.dockerjava.api.command.CreateConfigCmd;

public class FetchDataFromExcel 
{
	@Test
	public void fetcgDtat() throws Exception
	{
		FileInputStream file=new FileInputStream("C:\\Users\\User\\eclipseworkplace\\SeleniumFrameWork\\TestData\\testDta.xlsx.xlsx");
		
		Workbook book= WorkbookFactory.create(file);
		String value = book.getSheet("Markscard").getRow(2).getCell(0).getStringCellValue();
		System.out.println(value);
	}

}
