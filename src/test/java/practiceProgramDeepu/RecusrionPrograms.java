package practiceProgramDeepu;

import org.testng.annotations.Test;

public class RecusrionPrograms
{
	//	public static void main(String[] args) 
	//	{
	//		number(1);
	//
	//	}
	//	static public void number(int num)
	//	{
	//		if(num<=10)
	//		{
	//			System.out.println(num);
	//			num++;
	//			number(num);
	//		}
	//	}

	@Test
	public static void test(int num) 
	{
		if (num != 0) 
		{

			// Get the last digit of the number
			int n = num % 10;

			// Print the digit
			System.out.print(n);

			// Recursive call with the number divided by 10
			test(num / 10);
		}
	}

	// Example usage
	public static void main(String[] args) 
	{
		test(123); // Replace YourClassName with the actual class name
	}

	

}
