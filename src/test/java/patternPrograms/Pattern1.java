package patternPrograms;

import org.testng.annotations.Test;

public class Pattern1 {

	public static void main(String[] args)
	{
		int no=5;
		for (int i = 1,p=1; i <=5; i++,p++)    //for row
		{
			for (int j = i; j <=no; j++) 
			{
				System.out.print(" ");
			}
			for (int j = 1; j <i; j++) 
			{
				System.out.print(p);
			}
			for (int k = 1; k <=i; k++) 
			{
				System.out.print(p);
			}
			System.out.println("");

		}

	}
	@Test
	public void pattren()
	{
		int no=3;
		for (int i = 1; i <=no; i++)
		{
			for (int j = i,p=3; j <=no; j++) 
			{
              System.out.print(p++);
			}                           //3 2 1
			System.out.println("");     //3 2
			                            //3
		}

	}
}















