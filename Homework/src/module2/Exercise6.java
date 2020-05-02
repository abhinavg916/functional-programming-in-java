package module2;

import java.util.List;

public class Exercise6 {
	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
				"Kubernetes");
		printNoOfCharactersinEachCoursesinListStructure(courses);
	}

	private static void printNoOfCharactersinEachCoursesinListStructure(List<String> courses) {
		courses.stream()
		.map(course -> course + "-" +course.length())
		.forEach(System.out::println);
		
	}

}
