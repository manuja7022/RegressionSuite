package practiceProgramDeepu;

public class Last_minno 
{
	public static void main(String[]args)
	{
		int[] arr= {5,8,9,0,3};
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]> arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(arr[arr.length-1]);
		//System.out.println(arr[0]);
	}

}
