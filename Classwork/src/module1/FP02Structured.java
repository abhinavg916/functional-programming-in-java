// Task - Print the even numbers from a list of numbers

package module1;

import java.util.List;

public class FP02Structured {
	public static void main(String[] args) {

		// Approach - 1 : Traditional or Structured Way
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		printEvenNumbersInListStructure(numbers);
	}

	private static void printEvenNumbersInListStructure(List<Integer> numbers) {
		// To think - How to loop the numbers?
		for (int number : numbers) {
			if (number % 2 == 0)
				System.out.println(number);
		}
		// This means List -> Loop -> Operation
	}
}
