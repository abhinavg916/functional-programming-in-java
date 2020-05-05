// Task - To sort number in the list
package module3;

import java.util.List;

public class FP07UseofSorted {
	public static void main(String[] args) {
//		Using IDE
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		numbers.stream().sorted().forEach(System.out::println);
		System.out.println();
		numbers.stream().distinct().sorted().forEach(System.out::println);
		System.out.println();

		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
				"Kubernetes");
		courses.stream().sorted().forEach(System.out::println);
		
		
//		Using JShell
//		jshell> numbers.stream().sorted().forEach(System.out::println)
//		2
//		4
//		4
//		6
//		9
//		12
//		12
//		13
//		15

//		jshell> numbers.stream().distinct().sorted().forEach(System.out::println)
//		2
//		4
//		6
//		9
//		12
//		13
//		15

	}
}
