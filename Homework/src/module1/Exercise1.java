package module1;

import java.util.List;

public class Exercise1 {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		printOddNumbersinListStructure(numbers);
	}

	private static void printOddNumbersinListStructure(List<Integer> numbers) {
		numbers.stream().filter(number -> number % 2 != 0).forEach(System.out::println);
	}

}
