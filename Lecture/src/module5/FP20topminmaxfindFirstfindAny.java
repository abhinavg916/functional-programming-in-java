// Task - Utility Operations
package module5;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Course2 {
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;

	public Course2(String name, String category, int reviewScore, int noOfStudents) {
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

public class FP20topminmaxfindFirstfindAny {
	public static void main(String[] args) {
		List<Course2> courses = List.of(
				new Course2("Spring", "Framework", 98, 20000), 
				new Course2("Spring Boot", "Framework", 95, 18000),
				new Course2("API", "Microservices", 97, 22000),
				new Course2("Microservices", "Microservices", 96, 25000),
				new Course2("FullStack", "FullStack", 91, 14000), 
				new Course2("AWS", "Cloud", 92, 21000),
				new Course2("Azure", "Cloud", 99, 21000), 
				new Course2("Docker", "Cloud", 92, 20000),
				new Course2("Kubernates", "Cloud", 91, 2000)
		);
		
		Comparator<Course2> comparingByNumberOfStudentsAndReviewScore = Comparator
				.comparingInt(Course2::getNoOfStudents)
				.thenComparing(Course2::getReviewScore)
				.reversed();
		Predicate<Course2> reviewScoreLessThan90Predicate = course -> course.getReviewScore() < 90;
		Predicate<Course2> reviewScoreGreaterThan95Predicate = course -> course.getReviewScore() > 95;
		
		// max()
		System.out.println(courses);
//		[Spring:20000:98, Spring Boot:18000:95, API:22000:97, Microservices:25000:96, FullStack:14000:91, AWS:21000:92, Azure:21000:99, Docker:20000:92, Kubernates:2000:91]
		System.out.println(courses.stream().max(comparingByNumberOfStudentsAndReviewScore));
//		Optional[Kubernates:2000:91]
		
		// min()
		System.out.println(courses);
		System.out.println(courses.stream().min(comparingByNumberOfStudentsAndReviewScore));
//		Optional[Microservices:25000:96]
		

		System.out.println(courses);
		System.out.println(courses.stream()
				.filter(reviewScoreLessThan90Predicate)
				.min(comparingByNumberOfStudentsAndReviewScore)
				.orElse(new Course2 ("Kubernates", "Cloud", 91, 20000)));
//		Optional.empty
//		Kubernates:20000:91
		
		//findFirst()
		System.out.println(courses);
		System.out.println(courses.stream()
				.filter(reviewScoreGreaterThan95Predicate)
				.findFirst()
				);
//		Optional[Spring:20000:98]
		
		//findAny()
		System.out.println(courses);
		System.out.println(courses.stream()
				.filter(reviewScoreGreaterThan95Predicate)
				.findAny()
				);
//		Optional[Spring:20000:98]
		
		
	}

}
