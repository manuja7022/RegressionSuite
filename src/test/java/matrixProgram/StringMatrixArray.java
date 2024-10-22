package matrixProgram;

import java.util.HashMap;
import java.util.Map.Entry;

public class StringMatrixArray {

	public static void main(String[] args)
	{
		String[][] srr= {{"anu","banu","canu"},
				         {"anu","avn","banu"},
				         {"anu","big","dog"}};
		
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		for (int i = 0; i < srr.length; i++)
		{
			for (int j = 0; j < srr[i].length; j++)
			{
				String value= srr[i][j];
				map.put(value,map.getOrDefault(value, 0)+1);
			}
		}

		for ( Entry<String, Integer> str : map.entrySet()) 
		{
			if(str.getValue()>1)
			{
				System.out.println(str.getKey()+" repeated "+str.getValue()+" times");
			}
		}
	}

}
