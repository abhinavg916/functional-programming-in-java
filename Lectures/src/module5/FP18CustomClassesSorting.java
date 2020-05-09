//  Task – Sorting Custom Classes (Courses)
package module5;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Course {
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;

	public Course(String name, String category, int reviewScore, int noOfStudents) {
		super();
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.noOfStudents = noOfStudents;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public String toString() {
		return name + ":" + noOfStudents + ":" + reviewScore;
	}
}

public class FP18CustomClassesSorting {

	public static void main(String[] args) {

		List<Course> courses = List.of(
				new Course("Spring", "Framework", 98, 20000), 
				new Course("Spring Boot", "Framework", 95, 18000),
				new Course("API", "Microservices", 97, 22000),
				new Course("Microservices", "Microservices", 96, 25000),
				new Course("FullStack", "FullStack", 91, 14000), 
				new Course("AWS", "Cloud", 92, 21000),
				new Course("Azure", "Cloud", 99, 21000), 
				new Course("Docker", "Cloud", 92, 20000),
				new Course("Kubernates", "Cloud", 91, 2000)
		);
		
		Comparator<Course> 	comparingByNumberOfStudentsIncreasing = Comparator.comparingInt(Course::getNoOfStudents);
		System.out.println(courses.stream().sorted(comparingByNumberOfStudentsIncreasing).collect(Collectors.toList()));
		
		Comparator<Course> 	comparingByNumberOfStudentsDecreasing = Comparator.comparingInt(Course::getNoOfStudents).reversed();
		System.out.println(courses.stream().sorted(comparingByNumberOfStudentsDecreasing).collect(Collectors.toList()));
//		[Microservices:25000:96, API:22000:97, AWS:21000:92, Azure:21000:99, Spring:20000:98, Docker:20000:92, Spring Boot:18000:95, FullStack:14000:91, Kubernates:2000:91]
		
		Comparator<Course> 	comparingByNumberOfStudentsAndReviewScore = Comparator
									.comparingInt(Course::getNoOfStudents)
									.thenComparing(Course::getReviewScore)
									.reversed();
		System.out.println(courses.stream().sorted(comparingByNumberOfStudentsAndReviewScore).collect(Collectors.toList()));
//		[Microservices:25000:96, API:22000:97, Azure:21000:99, AWS:21000:92, Spring:20000:98, Docker:20000:92, Spring Boot:18000:95, FullStack:14000:91, Kubernates:2000:91]
		
		
	}

}