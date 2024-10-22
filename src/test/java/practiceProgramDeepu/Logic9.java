package practiceProgramDeepu;

public class Logic9 {

	public static void main(String[] args) 
	{
     String str="i am 45 manu 8";
     int num=0;
     for (int i = 0; i < str.length(); i++) 
     {
		     char ch= str.charAt(i);
		     if(Character.isDigit(ch))
		     {
		    	 num=num+Character.getNumericValue(ch);
		    	 System.out.println(ch);
		     }
	}
     System.out.println(num);
	}

}
