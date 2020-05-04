// Task - Create list from another list
package module3;

import java.util.List;
import java.util.stream.Collectors;

public class FP09 {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		List<Integer> squaredNumbers = squaredList(numbers);
		System.out.println(squaredNumbers);
	}

	private static List<Integer> squaredList(List<Integer> numbers) {
		return numbers.stream()
				.map(x -> x*x)
				.collect(Collectors.toList());
	}
}
