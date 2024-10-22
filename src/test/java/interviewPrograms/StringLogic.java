package interviewPrograms;

import org.checkerframework.checker.units.qual.Length;
import org.testng.annotations.Test;

public class StringLogic
{
	@Test
	public void string()
	{               //012345678
		String str="i am manu";
		//u na mmai
		System.out.println(str.length());

		for (int i=0; i<str.length(); i++)
		{
            // System.out.print(str.charAt(i));
             
             if(str.charAt(i)==' ')
             {
            	 System.out.println(str.charAt(i));
             }
		}
	}

}
