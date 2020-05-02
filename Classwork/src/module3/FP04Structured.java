// Task - Find the sum of all the numbers in the list
package module3;

import java.util.List;

public class FP04Structured {
	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		printSumOfAllNumbersInListStructure(numbers);
	}

	private static void printSumOfAllNumbersInListStructure(List<Integer> numbers) {
		int sum = 0;
		for(int number : numbers) {
			sum += number;
		}
		System.out.println(sum);
	}
}
