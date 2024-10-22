package seleniumScripts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WriteDataInExcel 
{
	@Test
	public void fetcgDtat() throws Exception
	{
		FileInputStream file=new FileInputStream("C:\\Users\\User\\eclipseworkplace\\SeleniumFrameWork\\TestData\\testDta.xlsx");

		Workbook book= WorkbookFactory.create(file);
		Sheet sh = book.getSheet("links");

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.amazon.in");
		
		Thread.sleep(3000);
		
		 List<WebElement> ele = driver.findElements(By.xpath("//a"));
		
		
		for (int i = 0; i <ele.size(); i++) 
		{
			Row row = sh.createRow(i);
			Cell cl = row.createCell(0);
			cl.setCellValue(ele.get(i).getAttribute("href"));
			
		}
		
		FileOutputStream fileout=new FileOutputStream("C:\\Users\\User\\eclipseworkplace\\SeleniumFrameWork\\TestData\\testDta.xlsx");
		book.write(fileout);
		file.close();
	    fileout.close();
	    book.close();
	    driver.quit();
	}

}
