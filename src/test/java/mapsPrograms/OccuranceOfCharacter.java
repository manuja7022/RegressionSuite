package mapsPrograms;

import java.util.HashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class OccuranceOfCharacter {

	@Test
	public void firstApproach()
	{
		String str="manuja";
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();

		char[] crr=str.toCharArray();
		for (char c : crr) 
		{
			map.put(c,map.getOrDefault(c, 0)+1);
		}
		for ( Entry<Character, Integer> c : map.entrySet())
		{
			System.out.println(c);
		}
	}
	@Test
	public static void main() 
	{
		String str="manuja";

		HashMap<Character,Integer> map=new HashMap<Character,Integer>();


		char[] crr= str.toCharArray();
		for (char ch : crr) 
		{
			if(map.containsKey(ch))
			{
				map.put(ch,map.get(ch)+1); //if char already there then increment count
			}
			else
			{
				map.put(ch, 1);
			}
		}
		for ( char ch: map.keySet()) 
		{
			System.out.println(ch + " occurs " + map.get(ch) + " time(s)");
			//getting value of key used
		}
	}

}
