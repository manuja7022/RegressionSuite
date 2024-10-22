package practiceProgramDeepu;

import org.testng.annotations.Test;

public class SumOfIntInString {


	@Test 
	public void twoDigitSum()
	{
		String st="a11b2c3";
		String s = st.replaceAll("[^0-9]", " ");
		System.out.println(s);
		String[] str = s.split(" ");
		int sum=0;
		for (int i = 0; i < str.length; i++)
		{
			try {
				//System.out.print(str[i]+" ");
				int num=Integer.parseInt(str[i]);
				sum=sum+num;

			}catch (NumberFormatException e)
			{

			}
		}
		System.out.println(sum);
	}
	@Test
	public static void main1() {
		String str="M1a45n2u"; //12
		String srr=  str.replaceAll("[^0-9]","");
		int sum=0;
		int num= Integer.parseInt(srr);
		while(num!=0)
		{
			int n=num%10;
			sum=sum+n;

			num=num/10;
		}
		System.out.println(sum);

	}



	@Test
	public static void main() {
		String str="M1a45n2u"; //12
		String[] crr=str.split("");
		int sum=0;
		for(int i=0; i<crr.length;i++)
		{
			try {
				int num = Integer.parseInt(crr[i]);
				sum=sum+num;
			}catch(NumberFormatException e)
			{

			}	
		}
		System.out.println(sum);

	}

	@Test
	public void string()
	{
		String str="M1a45n2u"; //12
		String[] crr=str.split("");
		int sum=0;

		for (int i = 0; i < crr.length; i++) 
		{
			if(str.charAt(i)>='0'&& str.charAt(i)<='9')
			{
				//System.out.println(str.valueOf(str.charAt(i)));
				int num=Integer.parseInt(str.valueOf(str.charAt(i)));
				sum=sum+num;
			}
		}
		System.out.println(sum);
	}

}
