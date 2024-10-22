package practiceProgramDeepu;

import org.testng.annotations.Test;

public class Stringrecursion 
{
	@Test
	static public void demo()
	{
	      sample("manuja");

	}
	public static void sample(String str)//manuja //manuj //manu //man //ma //m
	{

		//print last char
		System.out.print(str.charAt(str.length()-1)+" "); //a //j //u //n //a //m 
		                      //output =ajunam
		
		//6 //5 //4 //3 //2 //1 terminate
		if(str.length()>1)   //1>1 if condition breaks
		{
			sample(str.substring(0,str.length()-1));//manuj //manu //man //ma //m
		}
	}
}
