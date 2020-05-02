package module2;

import java.util.List;

public class Exercise4 {

	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
				"Kubernetes");
		printAllCoursesinListStructure(courses);
	}

	private static void printAllCoursesinListStructure(List<String> courses) {
		courses.stream()
		.filter(course -> course.length() > 3)
		.forEach(System.out::println);
	}

}
