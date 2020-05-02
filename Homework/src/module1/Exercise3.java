package module1;

import java.util.List;

public class Exercise3 {

	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
				"Kubernetes");
		printAllCoursesinListStructure(courses);
	}

	private static void printAllCoursesinListStructure(List<String> courses) {
		courses.stream()
		.filter(course -> course.contains("Spring"))
		.forEach(System.out::println);
	}
}
