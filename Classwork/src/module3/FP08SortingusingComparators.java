// Task - Sorting using Comparators
package module3;

import java.util.Comparator;
import java.util.List;

public class FP08SortingusingComparators {
	public static void main(String[] args) {
//		Using IDE
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
				"Kubernetes");
		numbers.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
		System.out.println();
		numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println();

		courses.stream().sorted(Comparator.comparing(str -> str.length())).forEach(System.out::println);

//		Using JShell
//		jshell> courses.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println)
//		API
//		AWS
//		Azure
//		Docker
//		Kubernetes
//		Microservices
//		PCF
//		Spring
//		Spring Boot
//
//		jshell> courses.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println)
//		Spring Boot
//		Spring
//		PCF
//		Microservices
//		Kubernetes
//		Docker
//		Azure
//		AWS
//		API
//
//		jshell>
//		<press tab again to see all possible completions; total possible completions: 548>
//		jshell> courses.stream().sorted(Comparator.comparing(str -> str.length())).forEach(System.out::println)
//		API
//		AWS
//		PCF
//		Azure
//		Spring
//		Docker
//		Kubernetes
//		Spring Boot
//		Microservices
	}

}
