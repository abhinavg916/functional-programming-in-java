// Task - Print the squares of even numbers in the list
package module2;

import java.util.List;

public class FP03UseofFilterandMap {
	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		printSquaresofEvenNumbersInListFunctional(numbers);
	}

	private static void printSquaresofEvenNumbersInListFunctional(List<Integer> numbers) {

		numbers.stream()
		.filter(number -> number % 2 == 0) // Use of Lambda Expression
		.map(x -> x*x) // Use of map for mapping x -> x*x
		.forEach(System.out::println);

	}
}
