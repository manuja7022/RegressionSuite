package practiceProgramDeepu;

public class Logic7 {

	public static void main(String[] args) 
	{

		int[] arr= {1,5,2,6,7};
		int[] srr= {4,8,9,3};
		System.out.println(srr.length+"=====");
	
		for (int i = 0; i < arr.length; i++)
		{
			if(i<srr.length) //0<4 1<4 2<4 3<4 
			{
				System.out.println(arr[i]+srr[i]);
			}else
			{                                   //4<4
				System.out.println(arr[i]);
			}
		}
	}

}
