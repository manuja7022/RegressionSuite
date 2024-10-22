package iteratorPrograms;

import java.util.ArrayList;
import java.util.Iterator;

public class Program1 {

	public static void main(String[] args) {

		int[] arr= {2,8,6,7,19,8,7};
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++)
		{
			list.add(arr[i]);
		}

		Iterator<Integer> iterator = list.iterator();

		// Removing numbers greater than 15 while iterating
		while (iterator.hasNext()) //if array have more elements then it will go inside loop
		{
			Integer num = iterator.next(); //iterate next element 
			if (num > 15) {
				iterator.remove(); // to  remova elements
			}
		}
		System.out.println("Remaining elements: " + list);

	}

}
