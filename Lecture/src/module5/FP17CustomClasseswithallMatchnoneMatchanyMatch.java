package module5;

import java.util.List;
import java.util.function.Predicate;

class Courses {
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;

	public Courses(String name, String category, int reviewScore, int noOfStudents) {
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

public class FP17CustomClasseswithallMatchnoneMatchanyMatch {

	public static void main(String[] args) {

		List<Courses> courses = List.of(
				new Courses("Spring", "Framework", 98, 20000), 
				new Courses("Spring Boot", "Framework", 95, 18000),
				new Courses("API", "Microservices", 97, 22000),
				new Courses("Microservices", "Microservices", 96, 25000),
				new Courses("FullStack", "FullStack", 91, 14000), 
				new Courses("AWS", "Cloud", 92, 21000),
				new Courses("Azure", "Cloud", 99, 21000), 
				new Courses("Docker", "Cloud", 92, 20000),
				new Courses("Kubernates", "Cloud", 91, 2000)
		);
		
		//allMatch, noneMatch, anyMatch
		
		// Task - Courses having good reviews
		Predicate<Courses> reviewScoreGreaterThan95Predicate = course -> course.getReviewScore() > 95;
		Predicate<Courses> reviewScoreGreaterThan90Predicate = course -> course.getReviewScore() > 90;
		Predicate<Courses> reviewScoreLessThan90Predicate = course -> course.getReviewScore() < 90;
		
		//allMatch
		System.out.println(courses.stream().allMatch(course -> course.getReviewScore() > 90)); // true
		System.out.println(courses.stream().allMatch(course -> course.getReviewScore() > 95)); // false beacuse not all are above 95
		System.out.println(courses.stream().allMatch(reviewScoreGreaterThan95Predicate)); // false

		//noneMatch
		System.out.println(courses.stream().noneMatch(course -> course.getReviewScore() > 95)); // false because none  of the courses must be greater than 95
		System.out.println(courses.stream().noneMatch(reviewScoreLessThan90Predicate)); // true because none of the courses is less than 90
		
		//anyMatch
		System.out.println(courses.stream().anyMatch(reviewScoreGreaterThan95Predicate)); // true
		System.out.println(courses.stream().anyMatch(reviewScoreLessThan90Predicate)); // false
	}

}
