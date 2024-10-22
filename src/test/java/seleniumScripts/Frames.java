package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames 
{
	@Test
	public void frames() throws Exception
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("");
		Thread.sleep(3000);
		
		//TO NAVIGATE MAIN PAGE TO FRAME
		driver.switchTo().frame(0);  //Based on index
		driver.switchTo().frame("id"); //based on id
		driver.switchTo().frame("webelement"); //based on web elements
		
		//TO NAVIGATE FROM FRAME TP MAIN PAGE
		
		driver.switchTo().defaultContent();
		
		// Switch to frame by name or ID
		driver.switchTo().frame("frameNameOrId");

		// Perform actions inside the frame
		driver.findElement(By.id("elementInsideFrame")).click();

		// Switch back to the main page
		driver.switchTo().defaultContent();

		// Perform actions on the main page
		driver.findElement(By.id("elementOnMainPage")).click();

	}

}
