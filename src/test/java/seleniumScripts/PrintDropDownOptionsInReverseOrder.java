package seleniumScripts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintDropDownOptionsInReverseOrder
{
	@Test
	public void browse() throws Exception
	{

		ArrayList arr=new ArrayList();
		arr.add("apple");
		arr.add("banana");
		arr.add("mango");
		arr.add("apple");
		
		TreeSet set=new TreeSet(Collections.reverseOrder());
			set.addAll(arr);

		
		for (Object ele : set) 
		{
			System.out.println(ele);
			
		}

	}
}
