package module3;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise11 {


	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
				"Kubernetes");
		List<Integer> courselen = courseLenList(courses);
		System.out.println(courselen);
	}

	private static List<Integer> courseLenList (List<String> courses) {
		return courses.stream().map(str -> str.length()).collect(Collectors.toList());
	}
//		jshell>courses.stream().map(str -> str.length()).collect(Collectors.toList());
//		$19 ==> [6, 11, 3, 13, 3, 3, 5, 6, 10]

}
