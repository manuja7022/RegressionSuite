package interviewPrograms;

import java.util.Iterator;
import java.util.Scanner;

import org.testng.annotations.Test;

public class TestvgrantLogic_3 {

	@Test
	public void main() //shifting array

	{
		int nrr[] = {1,2,3,4,5};

		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);

		int num = sc.nextInt();
		int first=nrr[num];  //1st index variable storing in first variable

		for (int i = 0; i < nrr.length-1; i++) 
		{
			nrr[i]=nrr[i+1];

		}

		nrr[nrr.length-1]=first; //storing 1st variable in last index of array

		for (int i = 0; i < nrr.length; i++) {
			System.out.println(nrr[i]);

		}

	}
	@Test
	public void shift()

	{
		int nrr[] = {1, 2, 3, 4, 5};

		// Specify the number of rotations

		System.out.println(nrr.length-1);
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);

		int num = sc.nextInt();  //start from 2 index

		int rotations = num;  //num=2

		// Perform the left rotations
		for (int r = 0; r < rotations; r++)   //r<2 runs 2 time this loop  

		{
			int first = nrr[0];  //0=1,0=2 storing in first variable 

			for (int i = 0; i < nrr.length - 1; i++) // 4-1=3
			{
				nrr[i] = nrr[i + 1];     //index[0+1]=2  index[1+1]=3

			}
			nrr[nrr.length - 1] = first;   //index value 1,2 will be store in nrr[3]
		}

		// Print the rotated array
		for (int i = 0; i < nrr.length; i++) {
			System.out.print(nrr[i] + " ");               //output 
		}



	}

	@Test
	public void scanner()
	{
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);

		int n = sc.nextInt();
		int[] num={1,2,3,4,5};
		//1 2 3 4 5 

		int rot=n;

		for (int i = 0; i < rot; i++) 
		{
			int first=num[0];
			//0
			for (int k = 0; k < num.length-1; k++) 
			{
				num[k]=num[k+1];
			}
			num[num.length-1]=first;

		}
		for (int i = 0; i < num.length; i++) 
		{
			System.out.println(num[i]);
		}
	}
}










