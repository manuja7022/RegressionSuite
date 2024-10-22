package mapsPrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;


public class MapsPrograms {

	public static void main(String[] args) 
	{
		LinkedHashMap<String, Integer> map=new LinkedHashMap<>();
		map.put("Apple",2);
		map.put("Mango", 5);
		map.put("Banana", 6);
		map.put("Apple", 1);

		
		for (Entry<String, Integer> maap : map.entrySet()) 
		{
			System.out.println(maap);
		}
	}

}
