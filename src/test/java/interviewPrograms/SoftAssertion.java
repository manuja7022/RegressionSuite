package interviewPrograms;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion
{
	@Test
	public void sample()
	{
		String str1="manuja";
		
		String str2="swathi";
		
		String str3="sunil";
		
		SoftAssert asserts=new  SoftAssert();
		asserts.assertEquals(str1, str2);
		System.out.println("i am manujs");
		asserts.assertEquals(str1, "1254");
		
		
		//without assertAll method
	}

	@Test
	public void demo()
	{
		String str1="manuja";
		
		String str2="swathi";
		
		String str3="sunil";
		
		SoftAssert asserts=new  SoftAssert();
		asserts.assertEquals(str1, str2);
		asserts.assertEquals(str1, "1254");
		
		asserts.assertAll();
		
		
		//if we assert.assertAll(); in console will get fail alongf with conditions where we failed
	}
}
