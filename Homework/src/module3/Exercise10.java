package module3;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise10 {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		List<Integer> evenNumbers = evenList(numbers);
		System.out.println(evenNumbers);
	}

	private static List<Integer> evenList(List<Integer> numbers) {
		return numbers.stream()
				.filter(x -> x % 2 == 0)
				.collect(Collectors.toList());
	}

}
