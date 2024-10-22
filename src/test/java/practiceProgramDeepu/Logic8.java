package practiceProgramDeepu;

import org.testng.annotations.Test;

public class Logic8 {

	public static void main(String[] args)
	{
		int num=145234;   //add last two digit

		
		if(num!=0)
		{
			int n=num%10;
			int n2=num%100/10;
			System.out.println(n+n2);
		}
		

	}

	@Test
	public void test()
	{
		int num=894751;
		if(num!=0)
		{
			int n1=num%100000/10000;
			int n2=num%1000/100;
			System.out.println(n1+"  "+n2);
			System.out.println(n1+n2);
		}
	}
}
