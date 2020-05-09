// Stream Operations
package module3;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FP10StreamOperations {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		numbers.stream()
			.distinct() // Returns Stream<T> Intermediate
			.sorted() // Returns Stream<T>
			.forEach(System.out::println); // Returns void

		List<Integer> squaredNumbers = numbers.stream()
				.map(number -> number * number) // Returns Stream<R>
				.collect(Collectors.toList()); // Returns R

		List<Integer> evenNumbersOnly = numbers.stream()
				.filter(x -> x % 2 == 0) //Returns Stream<T>
				.collect(Collectors.toList());
		
		int sum = numbers.stream()
				.reduce(0, (x,y) -> x*x + y*y); //Returns T
		
		int greatest = numbers.stream()
				.reduce(Integer.MIN_VALUE, (x,y)-> x>y ? x:y);
		
		List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");

		List<String> coursesSortedByLengthOfCourseTitle = courses.stream()
				.sorted(Comparator.comparing(str -> str.length()))
				.collect(Collectors.toList());
	}

}
