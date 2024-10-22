package practiceProgramDeepu;

import org.testng.annotations.Test;

public class MaxnLengthInStringArray 
{
	@Test
	public void length()
	{
		String[] s= {"a","ab","abcd","e","abcde"};
		
		String maxLength = s[0];
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()>=maxLength.length())
			{
				maxLength=s[i];
			}
		}
	//	System.out.println(maxLength);
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()==maxLength.length())
			{
				System.out.print(s[i]+" ");
			}
		}
	}
	@Test
	public void lengthMin()
	{
		String[] s= {"a","ab","abcd","e","abcde"};
		
		String minLength = s[0];
		for (int i = 0; i < s.length; i++) 
		{
			if(s[i].length()<=minLength.length())
			{
				minLength=s[i];
				System.out.println(minLength);

			}

		}
	}
}
