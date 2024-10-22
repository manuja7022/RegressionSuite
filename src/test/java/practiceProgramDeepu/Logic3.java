package practiceProgramDeepu;

public class Logic3 {

	public static void main(String[] args) 
	{
		String str="https://www.amazon.in";
		
		String[] str1= str.replace(".", " ").split(" ");
		String arr= str1[str1.length-2];
		System.out.println(arr);

		for (int i = arr.length()-1; i >0; i--) 
		{
			System.out.print(arr.charAt(i));
		}

	}

}
