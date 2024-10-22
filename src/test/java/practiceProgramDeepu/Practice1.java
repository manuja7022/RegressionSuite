package practiceProgramDeepu;

public class Practice1 
{

	
	public static void main(String[] args) 
	{
		 System.out.println("Try programiz.pro");
	        
	        String str="kicha12345";
	        
	        for(int i=0;i<str.length();i++)
	        {
	            char ch=str.charAt(i);
	            
	            if(Character.isAlphabetic(ch))
	            {
	            	if(i==0)
	            	{
	            	System.out.print((str.charAt(0)+"").toUpperCase());
	            	}
	            	
	            	else
	            	{
	            		System.out.print(ch);
	            	}
	            }
	        }
		
	}
}
