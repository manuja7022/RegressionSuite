package matrixProgram;

public class PrintMatrix {

	public static void main(String[] args) 
	{		
		int[][] arr= {{1,2,3,4},
				      {5,6,7,8},
				      {9,10,11,12}};
		
		for (int i = 0; i <arr.length; i++) //row
		{
			for (int j = 0; j <arr[i].length; j++) //cloumn
			{
				System.out.println(arr[i][j]);
			}
			
		}
		
	}

}
