package seleniumScripts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.testng.annotations.Test;

public class SortAndPrintInReverseOrder 
{
	@Test
	public void browse() throws Exception
	{
		String[] str= {"apple","banana","mango","lemon","apple"};
	

		ArrayList<String> list=new ArrayList<String>();

		for (String string : str) 
		{
			list.add(string);

		}
		Collections.sort(list,Collections.reverseOrder());
		for (String string : list) 
		{
			System.out.println(string);
		}
		
	}

}
