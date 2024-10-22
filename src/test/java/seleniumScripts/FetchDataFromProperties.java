package seleniumScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class FetchDataFromProperties
{
	@Test
	public void prop() throws Exception
	{
		FileInputStream s=new FileInputStream("C:\\Users\\User\\eclipseworkplace\\SeleniumFrameWork\\config.properties");
		Properties prop=new Properties();
		prop.load(s);
		
		String value = prop.getProperty("Name");
		System.out.println(value);
	}

}
