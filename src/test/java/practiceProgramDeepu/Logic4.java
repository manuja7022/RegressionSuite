package practiceProgramDeepu;

public class Logic4 {

	public static void main(String[] args)
	{
		String str="welcome to tyss";     //o/p   to tyss welcome    tyss welcome to   welcome to tyss

		String[]  srr= str.split(" ");

		for(int v=0;v<srr.length;v++) 
		{
			String first=srr[0];
			System.out.println(first+"=============");

			for(int k=0; k<srr.length-1; k++) 
			{
				srr[k]=srr[k+1];
			}
			srr[srr.length-1] = first;
			for (int i1 = 0; i1 <srr.length; i1++) 
			{
				System.out.print(srr[i1]+" ");

			}
			System.out.println(" ");

		}



	}
}


