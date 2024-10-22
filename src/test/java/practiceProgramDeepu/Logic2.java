package practiceProgramDeepu;

import java.util.TreeSet;

public class Logic2 {

	public static void main(String[] args) 
	{
		String str="aabbbccdabc";

		TreeSet<String> set=new TreeSet();
		for (int i = 0; i < str.length(); i++) 
		{
			char ch=str.charAt(i);
			String c=ch+"";
			for (int j = i+1; j < str.length(); j++)
			{
				c=c+str.charAt(j);
				//System.out.println(c);
				set.add(c);
			}
		}
		for (String object : set)
		{
			System.out.println(object);  
		}

	}

}
