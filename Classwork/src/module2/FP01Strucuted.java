// Task - Print all the numbers from a list
package module2;

import java.util.List;

public class FP01Strucuted {

	public static void main(String[] args) {
		// Approach - 1 : Traditional or Structured Way
		printAllNumbersInListStructure(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
	}

	private static void printAllNumbersInListStructure(List<Integer> numbers) {
		// To think - How to loop the numbers?
		for (int number : numbers) {
			System.out.println(number);
		}
		// This means List -> Loop -> Operation
	}
}
