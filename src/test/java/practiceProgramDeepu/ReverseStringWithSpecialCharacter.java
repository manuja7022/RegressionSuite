package practiceProgramDeepu;

public class ReverseStringWithSpecialCharacter {

	public static void main(String[] args) 
	{
		String s="o9#sol^ut#io$n&s"; //sn#oit^ul#os$9&o
		String s1=s.replaceAll("[^0-9A-Za-z]", ""); //print only number and alphabetic
		//String s2=s.replaceAll("[^0-9]", ""); //print only numbers
		//o9#sol^ut#io$n&s
		//index	//12 345 67 89 10 11
		System.out.println(s1.length()); //11 //o9solutions 11 length
		int j=s1.length()-1; //11-1
		System.out.println(j); //10

		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0'&& s.charAt(i)<='9'||s.charAt(i)>='A'&& s.charAt(i)<='Z'||s.charAt(i)>='a'&& s.charAt(i)<='z')
			{
				System.out.print(s1.charAt(j--));
			}
			else {
				System.out.print(s.charAt(i));
			}
		}
	}







}
