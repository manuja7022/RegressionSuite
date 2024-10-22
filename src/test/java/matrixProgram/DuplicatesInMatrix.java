package matrixProgram;

import java.util.HashMap;
import java.util.Map.Entry;

public class DuplicatesInMatrix {

	public static void main(String[] args)
	{
		int[][] arr= {{1,1,3,4},
				{5,6,7,8},
				{9,3,7,1}};
		
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++)
		{ 
			for (int j = 0; j < arr[i].length; j++) 
			{
				int  value=arr[i][j];
				map.put(value,map.getOrDefault(value,0)+1);
			}

		}
		for ( Entry<Integer, Integer> ary : map.entrySet()) 
		{
			if(ary.getValue()==1)
			{
				System.out.println(ary.getKey()+"   "+ary.getValue());
			}
			//System.out.println(map);
		}
	}

}
