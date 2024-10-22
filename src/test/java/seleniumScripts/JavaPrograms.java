package seleniumScripts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class JavaPrograms 
{
	@Test
	public void swap()
	{
		int a=10;  //5
		int b=5;   //10

		a=a-b;
		b=a+b;
		System.out.println(a+"===="+b);

	}

	@Test
	public void stringProgram()
	{
		String str="hi iam manu";  //manu iam hi

		String[]   srr=str.split(" ");
		for (int i = srr.length-1; i>=0; i--)
		{
			System.out.print(srr[i]+" ");
		}
	}

	@Test
	public void printEvenNum()
	{

		for (int i = 0; i <=10; i++)
		{
			if(i%2==0)
			{
				System.out.print("Even"+" "+i); //even number
			}
			else 
			{
				System.out.println(i+" "+"odd"); //odd number
			}
		}
	}

	@Test
	public void usingWhileLoop()
	{
		int i=1;

		while(i<10)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}

	}


	@Test
	public void usingDoWhileLoop()
	{
		int i=1;

		do {
			if(i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}while(i<=10);

	}

	@Test
	public void primeNumberUsingScanner()
	{
		System.out.println("enter num");

		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();

		int count=0;
		for (int i = 1; i <=num; i++)
		{
			if(num%i==0)
			{
				count++;
			}

		}
		System.out.println(count);
		if(count==2)
		{
			System.out.println("it is prime number");
		}else
		{
			System.out.println("not a prime number");
		}

	}
	@Test
	public void countHowManyTimesNumberRepeated()
	{

		int num =34323;
		int count=0;

		char[] str = String.valueOf(num).toCharArray();

		for (char c : str)
		{
			if(c=='3')
			{
				count++;
			}

		}
		System.out.println("The digit 3 is repeated " + count + " times.");



	}

	@Test
	public void repeatedStringInArray()
	{
		String[] srr= {"manu","arya","swati","manu","manu"};
		int count=0;
		for (int i = 0; i < srr.length; i++) 
		{
			for (int j = i+1; j < srr.length; j++) 
			{
				if(srr[i].equals(srr[j]))
				{
					count++;

				}
			}
		}


	}
	@Test
	public void repeatedStringInArrayUsingCollection()
	{
		String[] srr= {"manu","arya","manu","anu"};
		ArrayList<String> list=new ArrayList<>();

		for (int i = 0; i < srr.length; i++) 
		{
			list.add(srr[i]);
		}
		for (String string : list) {


			int count=0;
			for (int j = 0; j < srr.length; j++) 
			{
				if(string.equals(srr[j]))
				{
					count++;
				}

			}
			System.out.println(string+"     "+count);
		}
	}

	@Test
	public void occuranceOFEachWordInArray()
	{
		String[] srr = {"manu", "arya", "swati", "manu","manu"};


		for (int i = 0; i < srr.length; i++)
		{
			int count=1;
			for (int j = i+1; j < srr.length; j++) 
			{
				if(srr[i].equals(srr[j]))
				{
					count++;

					srr[j]="A";
				}
			}

			if(count>=1 && !srr[i].equals("A"))
			{
				System.out.println(srr[i]+" "+count);
			}

		}
	}


	@Test
	public void lastIndexOfArray()
	{
		String[] srr = {"manu", "arya", "swati", "manu","manu"};

		System.out.println(srr.length-1+" <==== last index of array");
		System.out.println(srr[srr.length-1]+" <===== last index value");

	}

	@Test
	public void removeDuplicateWordInStringUsingCollection()
	{
		String str="i am manuja i am from banglore";
		String[] srr= str.split(" ");

		LinkedHashSet<String> set=new LinkedHashSet<>();

		for (int i = 0; i < srr.length; i++) 
		{
			set.add(srr[i]);
		}

		for (String string : set) 
		{
			System.out.println(string+" ");

		}

	}

	@Test
	public void removeDuplicateWordInStringUsingLoops()
	{
		String str="i am manuja i am from banglore";
		String[] srr= str.split(" ");

		for (int i = 0; i < srr.length; i++)
		{
			int count=1;
			for (int j = i+1; j < srr.length; j++) 
			{
				if(srr[i].equals(srr[j]))
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(srr[i]);
			}


		}

	}
	@Test
	public void sequenceOfCharacterInPresentString()// means postion of each character
	{
		String str="manuja";
		char[] srr = str.toCharArray();

		for (int i = 0; i < srr.length; i++) 
		{
			System.out.println(srr[i]+" present in "+i+" postion");

		}

	}

	@Test
	public void characterPrograms() 
	{                                 //input =aabbccabc  o/p= a=2 b=2 c=3 a=1 b=1 c=1
		String str="aabbccabc";
		char[] crr = str.toCharArray();

		for (int i = 0; i < crr.length; i++) 
		{
			int count =1;
			for (int j = i+1; j < crr.length; j++)
			{
				if(crr[i]==crr[j])
				{
					count++;
					i++;
				}
				else
				{
					break;
				}

			}
			System.out.println(crr[i]+""+count);
		}

	}

	@Test
	public void secondMaxNumber() 
	{
		int num=293450678;
		String numStr = String.valueOf(num);
		int[] digitArray = new int[numStr.length()];

		for (int i = 0; i < numStr.length(); i++) {
			digitArray[i] = Character.getNumericValue(numStr.charAt(i)); // Convert char to int and adding charatcetr to int array
		}

		Arrays.sort(digitArray);
		// Print the resulting array
		for (int digit : digitArray) {
			System.out.print(digit + " ");
		}
	}

	@Test
	public void numberToStringConverter()
	{
		int num=5197683;

		String str = String.valueOf(num);

		// add to int array

		int[] irr=new int[str.length()];

		for (int i = 0; i < irr.length; i++) 
		{	
			irr[i] = Character.getNumericValue(str.charAt(i));
		}

		Arrays.sort(irr);

		int array = irr.length-1;

		System.out.println("1st max number "+ irr[irr.length-1]);
	}

	@Test
	public void numberToStringAndMaxAndMinNumber()
	{
		int num=94173620;
		String str = String.valueOf(num);

		int[] nrr=new int[str.length()];

		for (int i = 0; i < nrr.length; i++)
		{
			nrr[i]= Character.getNumericValue(str.charAt(i));
		}

		Arrays.sort(nrr);

		System.out.println("1st max number is ==>"+nrr[nrr.length-1]);
		System.out.println("2nd max number is ==>"+nrr[nrr.length-2]);

		System.out.println("1st min number is ==>"+nrr[0]);

	}

	@Test
	public void ovels()
	{

		String[] srr= {"manu","rani","dakshi","putty","swathi"};

		for (int i = 0; i < srr.length; i++) 
		{ 
			int count=0;

			String str = srr[i];


			for (int j = 0; j < str.length(); j++) 
			{
				char ch = str.charAt(j);

				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					count++;
				}	
			}
			System.out.println(srr[i]+"  "+count);

		}


	}
	@Test
	public void upperAndLowerCase()
	{
		String str="Manuja G LaMaNi";
		
		  char[] chr=str.toCharArray();
		  for (int i = 0; i < chr.length; i++) 
		  {
			  
			if(Character.isUpperCase(chr[i]))
			{
				         String  s1=chr[i]+"";
				         System.out.print(s1.toLowerCase());
			}
			else
			{
				              String s2=chr[i]+"";
				              System.out.print(s2.toUpperCase());
			}
		}

	}
	
	@Test
	public void triangle()
	{
		for (int i = 1; i <=5; i++) 
		{
			int p=1;
			for (int j = i; j <=5; j++)
			{
				System.out.print(p);
				p++;
				
			}
			System.out.println(" ");
		}
		
	}
}

























