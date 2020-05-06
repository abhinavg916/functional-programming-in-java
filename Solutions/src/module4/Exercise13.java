package module4;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise13 {

	public static void main(String[] args) {
//		Given, List squaredNumbers = numbers.stream().map(x -> x*x).collect(Collectors.toList());
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		List squaredNumbers = numbers.stream().map(x -> x * x).collect(Collectors.toList());

		// Using Behvaior Parameterisation
		List squaredNumbers2 = mapAndCreateNewList(numbers, x -> x * x);
		List cubedNumbers = mapAndCreateNewList(numbers, x -> x * x * x);
		List doubledNumbers = mapAndCreateNewList(numbers, x -> 2 * x);
		System.out.println(squaredNumbers2);
		System.out.println(cubedNumbers);
		System.out.println(doubledNumbers);
	}

	private static List<? extends Integer> mapAndCreateNewList(List<Integer> numbers,
			Function<Integer, Integer> mappingFunction) {
		return numbers.stream().map(mappingFunction).collect(Collectors.toList());
	}

}
