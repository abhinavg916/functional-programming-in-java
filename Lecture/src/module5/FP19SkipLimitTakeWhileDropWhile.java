// Task - Utility Operations
package module5;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Course1 {
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;

	public Course1(String name, String category, int reviewScore, int noOfStudents) {
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


public class FP19SkipLimitTakeWhileDropWhile {
	public static void main(String[] args) {
		List<Course1> courses = List.of(
				new Course1("Spring", "Framework", 98, 20000), 
				new Course1("Spring Boot", "Framework", 95, 18000),
				new Course1("API", "Microservices", 97, 22000),
				new Course1("Microservices", "Microservices", 96, 25000),
				new Course1("FullStack", "FullStack", 91, 14000), 
				new Course1("AWS", "Cloud", 92, 21000),
				new Course1("Azure", "Cloud", 99, 21000), 
				new Course1("Docker", "Cloud", 92, 20000),
				new Course1("Kubernates", "Cloud", 91, 2000)
		);
		
		Comparator<Course1> comparingByNumberOfStudentsAndReviewScore = Comparator
				.comparingInt(Course1::getNoOfStudents)
				.thenComparing(Course1::getReviewScore)
				.reversed();
		
		// limit()
		System.out.println(courses.stream()
				.sorted(comparingByNumberOfStudentsAndReviewScore)
				.limit(5)		// Top 5 only
				.collect(Collectors.toList()));
//		[Microservices:25000:96, API:22000:97, Azure:21000:99, AWS:21000:92, Spring:20000:98]
		
		
		// skips()
		System.out.println(courses.stream()
				.sorted(comparingByNumberOfStudentsAndReviewScore)
				.skip(3)		// Top 3 are skipped
				.collect(Collectors.toList()));
//		[AWS:21000:92, Spring:20000:98, Docker:20000:92, Spring Boot:18000:95, FullStack:14000:91, Kubernates:2000:91]
		
//		skips() and limit() together
		System.out.println(courses.stream()
				.sorted(comparingByNumberOfStudentsAndReviewScore)
				.skip(3)		// Top 3 are skipped i.e Microservices, API and Azure
				.limit(5)		// Top 5 are shown
				.collect(Collectors.toList()));
//		[AWS:21000:92, Spring:20000:98, Docker:20000:92, Spring Boot:18000:95, FullStack:14000:91]
		
		
		// takeWhile()
		System.out.println(courses);
//		[Spring:20000:98, Spring Boot:18000:95, API:22000:97, Microservices:25000:96, FullStack:14000:91, AWS:21000:92, Azure:21000:99, Docker:20000:92, Kubernates:2000:91]
		System.out.println(courses.stream().takeWhile(course -> course.getReviewScore()>=95).collect(Collectors.toList()));
//		[Spring:20000:98, Spring Boot:18000:95, API:22000:97, Microservices:25000:96]
	
		
		// dropWhile()
		System.out.println(courses);
//		[Spring:20000:98, Spring Boot:18000:95, API:22000:97, Microservices:25000:96, FullStack:14000:91, AWS:21000:92, Azure:21000:99, Docker:20000:92, Kubernates:2000:91]
		System.out.println(courses.stream().dropWhile(course -> course.getReviewScore()>=95).collect(Collectors.toList()));
//		[FullStack:14000:91, AWS:21000:92, Azure:21000:99, Docker:20000:92, Kubernates:2000:91]	
		
	}
}
