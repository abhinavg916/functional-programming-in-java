// Task - Print the even numbers from a list of numbers
package module2;

import java.util.List;

public class FP02Functional {

	public static void main(String[] args) {

		// Approach - 2 : Functional Way
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		printEvenNumbersInListFunctional(numbers);
	}

//	private static boolean isEven(int number) {
//		return number % 2 == 0;
//	}

	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
		// To think - What to do?
//		numbers.stream().filter(FP02Functional::isEven) // Use of Filter
//				.forEach(System.out::println); // Use of Method References

		// Improvised Way
		numbers.stream().filter(number -> number % 2 == 0) // Use of Lambda Expression
				.forEach(System.out::println);

	}

}
