package module5;

import java.util.List;

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

public class FP17CustomClasses {

	public static void main(String[] args) {
		
		List.of( 
				new Courses("Spring", "Framework", 98, 2000),
				new Courses("Spring Boot", "Framework", 95, 2000),
				new Courses("API", "Microservices", 97, 2000),
				new Courses("Microservices", "Microservices", 96, 2000),
				new Courses("FullStack", "FullStack", 91, 2000),
				new Courses("AWS", "Cloud", 92, 2000),
				new Courses("Azure", "Cloud", 99, 2000),
				new Courses("Docker", "Cloud", 92, 2000),
				new Courses("Kubernates", "Cloud", 91, 2000),
				
				);

	}

}
