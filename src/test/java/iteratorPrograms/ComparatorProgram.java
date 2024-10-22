package iteratorPrograms;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorProgram {

	public static void main(String[] args) {
		Integer[] numbers = {5, 3, 8, 1, 4};

		// Sort using a Comparator to order integers in descending order
		Arrays.sort(numbers, new Comparator<Integer>() {
			
			public int compare(Integer num1, Integer num2)
			{
				return num2.compareTo(num1); // For descending order
			}
		});

		// Print the sorted array
		System.out.println(Arrays.toString(numbers));
	}
}


