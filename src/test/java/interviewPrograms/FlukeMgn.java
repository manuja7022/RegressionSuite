package interviewPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class FlukeMgn {

	//	public static void main(String[] args) {
	//		//convert array to list
	//
	//		String[] str= {"apple","mango","banana","apple"};
	//		ArrayList<String> list=new ArrayList<String>();
	//
	//		//System.out.println(Collections.addAll(list, str));
	//		for (String string : list) 
	//		{
	//			//System.out.println(string);
	//
	//		}
	//
	//		//convert list to array
	//
	//		ArrayList<String> list1=new ArrayList<String>();
	//		list1.add("manu");
	//		list1.add("anu");
	//		list1.add("vinu");
	//
	//		String[] srr=new String[3];
	//		for (int i = 0; i <srr.length; i++) 
	//		{
	//			srr[i]=list1.get(i);
	//		}
	//
	//		for (String string : srr)
	//		{
	//			System.out.println(string);
	//		}
	//	}

	@Test
	public void duplicates()
	{
		//without collections
		String[] str= {"apple","mango","banana","apple"};

		for (int i = 0; i < str.length; i++) 
		{
			int count=1;
			for (int j = i+1; j < str.length; j++) 
			{
				if(str[i].equals(str[j]))
				{
					count++;
					str[j]="A";
				}
			}
			if(!str[i].equals("A"))
			{
				//System.out.println(str[i]);
			}
		}
	}


	@Test 
	public void duplicate()
	{
		String[] str= {"apple","mango","banana","apple"};
		
		LinkedHashSet<String> set=new LinkedHashSet<String>(Arrays.asList(str));
		
		for (String string : set) 
		{
			int count=0;

			//System.out.println(string);
			
			for (int i = 0; i < str.length; i++)
			{
				if(string.equals(str[i]))
				{
					count++;
				}
			}
			if(count>=1)
			{
				System.out.println(string+"===="+count);
			}
		}
		

	}













}
