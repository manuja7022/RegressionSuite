package mapsPrograms;

import java.util.HashMap;
import java.util.Map.Entry;

public class DuplicatesStringUsingMap {

	public static void main(String[] args)
	{

		String[] str= {"manu","anu","manu","vinu"};
		
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		
		for (int i = 0; i < str.length; i++) 
		{
			map.put(str[i], map.getOrDefault(str[i], 0)+1);
		}
		for (Entry<String, Integer> srr : map.entrySet()) 
		{
		if(srr.getValue()>1)
		{
			System.out.println(srr.getKey()+"  count: "+srr.getValue());
		}
		}
	}

}
