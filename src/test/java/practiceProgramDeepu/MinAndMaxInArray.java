package practiceProgramDeepu;

import java.util.Arrays;

public class MinAndMaxInArray {

	public static void main(String[] args) 
	{

		System.out.println(str()[0]+" 1st minimum number in array ");
		System.out.print(str()[str().length-1]+" 1st maximum number in array");
	}
	public static int[] str()
	{
		int[] arr= {9,0,3,7,6,4,8};
		Arrays.sort(arr);
		return arr;
	}
}
