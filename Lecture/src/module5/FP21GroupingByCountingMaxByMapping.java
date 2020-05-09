// Task - Grouping of elements
package module5;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Course3 {
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;

	public Course3(String name, String category, int reviewScore, int noOfStudents) {
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

public class FP21GroupingByCountingMaxByMapping {
	public static void main(String args[]) {
		List<Course3> courses = List.of(
				new Course3("Spring", "Framework", 98, 20000), 
				new Course3("Spring Boot", "Framework", 95, 18000),
				new Course3("API", "Microservices", 97, 22000),
				new Course3("Microservices", "Microservices", 96, 25000),
				new Course3("FullStack", "FullStack", 91, 14000), 
				new Course3("AWS", "Cloud", 92, 21000),
				new Course3("Azure", "Cloud", 99, 21000), 
				new Course3("Docker", "Cloud", 92, 20000),
				new Course3("Kubernates", "Cloud", 91, 2000)
		);
		
		Comparator<Course3> comparingByNumberOfStudentsAndReviewScore = Comparator
				.comparingInt(Course3::getNoOfStudents)
				.thenComparing(Course3::getReviewScore)
				.reversed();
		Predicate<Course3> reviewScoreLessThan90Predicate = course -> course.getReviewScore() < 90;
		Predicate<Course3> reviewScoreGreaterThan95Predicate = course -> course.getReviewScore() > 95;
		
		// groupingBy
		System.out.println(courses.stream()
			.collect(Collectors.groupingBy(Course3::getCategory)));
/*		{Cloud=[AWS:21000:92, Azure:21000:99, Docker:20000:92, Kubernates:2000:91], 
		FullStack=[FullStack:14000:91], Microservices=[API:22000:97, Microservices:25000:96], 
				Framework=[Spring:20000:98, Spring Boot:18000:95]} */

		
		// counting()
		System.out.println(courses.stream()
				.collect(Collectors.groupingBy(Course3::getCategory, Collectors.counting())));
//		{Cloud=4, FullStack=1, Microservices=2, Framework=2}

		// maxBy()
		System.out.println(courses.stream()
				.collect(Collectors.groupingBy(Course3::getCategory, 
						Collectors.maxBy(Comparator.comparing(Course3::getReviewScore)))));
/*		{Cloud=Optional[Azure:21000:99], FullStack=Optional[FullStack:14000:91], 
		Microservices=Optional[API:22000:97], Framework=Optional[Spring:20000:98]} */
		
		// mapping()
		System.out.println(courses.stream()
				.collect(Collectors.groupingBy(Course3::getCategory,
						Collectors.mapping(Course3::getName, Collectors.toList() ))));	
/*		{Cloud=[AWS, Azure, Docker, Kubernates], FullStack=[FullStack], 
				Microservices=[API, Microservices], Framework=[Spring, Spring Boot]} */
		
	}

}
