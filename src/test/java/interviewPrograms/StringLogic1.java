package interviewPrograms;

public class StringLogic1 {

	public static void main(String[] args) 
	{


		String str="i am manuja";
		//output  =a ju nammai

		String str1= str.replace(" ", "");//iammanuja
		
		int count=str1.length()-1;      //8

		for (int i = 0; i < str.length(); i++) 
		{
             char  ch= str.charAt(i);
             
             if(Character.isAlphabetic(ch))
             {
            	 System.out.print(str1.charAt(count));
            	 count--;
             }
             else
             {
            	 System.out.print(str.charAt(i));
             }

		}
	}

}
