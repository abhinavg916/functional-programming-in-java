package module2;

import java.util.List;

public class Exercise5 {
	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		printCubesofOddNumbersInListFunctional(numbers);
	}

	private static void printCubesofOddNumbersInListFunctional(List<Integer> numbers) {

		numbers.stream()
		.filter(number -> number % 2 != 0) // Use of Lambda Expression
		.map(x -> x*x*x) // Use of map for mapping x -> x*x
		.forEach(System.out::println);

	}

}
