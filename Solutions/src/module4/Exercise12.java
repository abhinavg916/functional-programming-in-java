package module4;

import java.util.List;
import java.util.function.BinaryOperator;

public class Exercise12 {

	public static void main(String[] args) {
//		Given, int sum = numbers.stream() .reduce(0, Integer::sum);
		
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

		// Scenario 1
		int sum = numbers.stream().reduce(0, Integer::sum);
		System.out.println(sum);

		// Scenario 2
		BinaryOperator<Integer> accumulator = Integer::sum;
		int sum1 = numbers.stream().reduce(0, accumulator);
		System.out.println(sum1);

		// Scenario 3
		BinaryOperator<Integer> accumulator2 = new BinaryOperator<Integer>() {
			public Integer apply(Integer x, Integer y) {
				return x + y;
			}
		};

		int sum2 = numbers.stream().reduce(0, accumulator2);
		System.out.println(sum2);

	}

}
