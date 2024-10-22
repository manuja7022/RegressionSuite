package seleniumScripts;

import java.util.ArrayList;
import java.util.Collections;

import org.testng.annotations.Test;

public class AddArrayToList 
{
	@Test
	public void browse() throws Exception
	{
	String[] array= {"apple","banana","mango","lemon","apple"};
	
	ArrayList<String> list=new ArrayList<String>();
	
	Collections.addAll(list, array);
	
	for (String string : list) 
	{
		System.out.println(string);
		
	}
	for (int i = 0; i < array.length; i++) {
		System.out.println(array[i]);
	}
	}
}
