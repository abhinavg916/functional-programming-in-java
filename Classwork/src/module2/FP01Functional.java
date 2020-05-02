// Task - Print all the numbers from a list
package module1;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		// Approach - 2 : Functional Way
		printAllNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
	}

//	private static void print(int number) {
//		System.out.println(number);
//	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		// To think - What to do?
		// Convert list of numbers into stream of numbers
		// [12, 9, 13, 4, 6, 2, 4, 12, 15]
		// That means it should come like in sequence
		// 12
		// 9
		// 13
		// 4
		// ... so on

//		numbers.stream().forEach(FP01Functional::println); // Use of Method References
		// This means List -> Streams -> Operation

		// Improvised Way
		numbers.stream().forEach(System.out::println); // Use of Method References

	}
}
