package interviewPrograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Fluke {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		
		String name = sc.nextLine();
		
		Map<String, int[]> map=new LinkedHashMap<>();
		
		int a[]=new int[2];
		map.put("Krishna", new int[]{10, 20, 30});
		map.put("Malika", new int[]{50, 20, 30});


		if(map.containsKey(name))
		{
			int[] mark = map.get(name);
			System.out.println(getAvgMark(mark));
		}
		else
		{
			System.out.println("name not found");
		}


	}


	public static double getAvgMark(int arr[])
	{
		int sum=0;
		for(int b:arr)
		{
			sum=sum+b;
		}
		double avg=sum/arr.length;
		return avg;
	}
}





