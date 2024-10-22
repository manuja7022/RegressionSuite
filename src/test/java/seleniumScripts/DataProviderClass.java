package seleniumScripts;
import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;
public class DataProviderClass 
{
	
	
	@Test (dataProvider = "getData")
	public void testData(int num)
	{
		System.out.println(num);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		
	
		Object[][] obj=new Object[3][1];
		obj[0][0]=9;
		obj[1][0]=8;
		obj[2][0]=7;
		
		return obj;
		
	}
	
	

}
