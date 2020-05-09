// Task - Find the sum of all the numbers in the list
package module3;

import java.util.List;

public class FP04Functional {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		System.out.println(printSumOfAllNumbersInListStructure(numbers));
//		printSumOfAllNumbersInListStructure(numbers);
	}

//	private static int sum(int a, int b) {
//		System.out.println(a + " " + b);
//		return a + b;
//	}

	private static int printSumOfAllNumbersInListStructure(List<Integer> numbers) {

		// Combine each one of them into one result i.e One value
		// 0 and (a,b) -> a + b
		// Stream of number -> One result value

//		return numbers.stream().reduce(0, FP04Functional::sum); // Use of Reduce
//		return numbers.stream().reduce(0, (a,b) -> a+b);
		return numbers.stream().reduce(0, Integer::sum);
	}

}
