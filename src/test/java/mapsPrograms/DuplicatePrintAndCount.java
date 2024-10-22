package mapsPrograms;

import java.util.LinkedHashMap;

public class DuplicatePrintAndCount {

	public static void main(String[] args)
	{

		String str="manujaj";
		char[] crr=str.toCharArray();
		LinkedHashMap<Character, Integer> map=new LinkedHashMap<Character, Integer>();

		int count=1;
		for (char ch : crr) 
		{
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
				count++;
				System.out.println(ch+"   "+map.get(ch));
			}else
			{
				map.put(ch,1);
			}
		}
//		if(count>=2)
//		{
//			for (char ch : map.keySet()) 
//			{
//				//System.out.println(ch+"   "+map.get(ch));
//			}
//		}

	}

}
