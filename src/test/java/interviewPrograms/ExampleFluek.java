package interviewPrograms;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class ExampleFluek {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		   String name = sc.nextLine();
		int[] arr= new int[2];
		LinkedHashMap<String, int[]> map=new LinkedHashMap<String, int[]>();
		
		map.put("manu", new int[]{10,20,30});
		map.put("Malika", new int[]{50, 20, 30});
		
		if(map.containsKey(name))
		{ int[] marks = map.get(name);
			System.out.println(avrg(marks)+"<===enter avg");
			
		}
		else
		{
			System.out.println("name not found");
		}

	}
	
	public static double  avrg(int[] a)
	{
		int sum=0;
		for (int b : a) 
		{
			sum=sum+b;
		}
		double avg=sum/a.length;

		return avg;
		
		
	}

}
