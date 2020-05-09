package module4;

import java.util.List;
import java.util.function.Predicate;

public class FP12BehaviorParameterization {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

		// Redundancy in code
		numbers.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
		numbers.stream().filter(x -> x % 2 != 0).forEach(System.out::println);

		// Solution
		Predicate<? super Integer> evenPredicate = x -> x % 2 == 0;
		filterandPrint(numbers, evenPredicate);
		Predicate<? super Integer> oddPredicate = x -> x % 2 != 0;
		filterandPrint(numbers, oddPredicate);

		// Inline Method
		filterandPrint(numbers, x -> x % 2 == 0); // Even Numbers
		filterandPrint(numbers, x -> x % 2 != 0); // Odd Numbers
		filterandPrint(numbers, x -> x % 3 == 0); // Multiple of 3

	}

	private static void filterandPrint(List<Integer> numbers, Predicate<? super Integer> predicate) {
		numbers.stream().filter(predicate).forEach(System.out::println);
	}
}
