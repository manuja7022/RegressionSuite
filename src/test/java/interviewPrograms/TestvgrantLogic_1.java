package interviewPrograms;

import org.testng.annotations.Test;

public class TestvgrantLogic_1
{
	//using recursion reverse the given string

	@Test 
	public void samplre()
	{
		//String str="manuja"; //outpu=ajunam
		reverse("manuja");
	
	}


	static void reverse(String str)
	{
		System.out.print(str.charAt(str.length() - 1)); // Print the last character   //a
		
		if (str.length() > 1) 
		{
			reverse(str.substring(0, str.length() - 1)); // Recur with the remaining substring  manuj
			
		}
	}
	@Test 
	public void reverseString()
	{
		reverse1("manuja");
	}

	static void reverse1(String str)
	{
		System.out.print(str.charAt(str.length()-1));
		
		if(str.length()>1)
		{
			reverse1(str.substring(0,str.length()-1));
		}
	}
}







