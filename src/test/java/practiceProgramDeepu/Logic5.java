package practiceProgramDeepu;

import org.testng.annotations.Test;

public class Logic5 {

	public static void main(String[] args) 
	{
		String str="share me 1245678 amount";

		String s1="";

		for (int i = 0; i < str.length(); i++) 
		{
             char ch=str.charAt(i);
             
             if(Character.isDigit(ch))
             {
            	 
             }
             else
             {
            	 s1=s1+ch;
             }
		}
		System.out.println(s1.split(" ").length-1);

	}

	@Test
	public void tesr()
	{
		String str="share me 124 amount";
		int num=0;
		for (int i = 0; i < str.length(); i++) 
		{
			
			     char ch=str.charAt(i);
			     if(Character.isDigit(ch))
			     {
			    	num=num+Character.getNumericValue(ch); 
			     }
			   
		}
		  System.out.println(num);
	}
}
