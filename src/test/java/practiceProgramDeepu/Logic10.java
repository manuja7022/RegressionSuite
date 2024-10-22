package practiceProgramDeepu;

public class Logic10 {

	public static void main(String[] args) 
	{
		String str="i Am  MaNujA";
		for (int i = 0; i < str.length(); i++) 
		{
            char ch=str.charAt(i);
           
            if(Character.isUpperCase(ch))
            {
                String	s1=ch+"";
            	System.out.print(s1.toLowerCase());
            }
            else
            {
            	String s2=ch+"";
            	System.out.print(s2.toUpperCase());
            }
		}
	}

}
