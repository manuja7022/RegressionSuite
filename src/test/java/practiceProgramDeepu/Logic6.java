package practiceProgramDeepu;

public class Logic6 {

	public static void main(String[] args) 
	{
		//find two num which is sum of 10 
		int[] nrr= {1,8,2,3,4,5,6,7,9,};
		int num=10;

		for (int i = 0; i < nrr.length; i++) 
		{
			for (int j = i+1; j < nrr.length; j++) 
			{
				if(nrr[i]+nrr[j]==num)
				{
					System.out.println(nrr[i]+"===="+nrr[j]);
				}
				
			}
			
		}
	}

}
