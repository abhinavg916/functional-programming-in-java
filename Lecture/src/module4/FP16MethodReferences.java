package module4;

import java.util.List;
import java.util.function.Supplier;

public class FP16MethodReferences {
	
	private static void print(String str) {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
		courses.stream()
		.map(str -> str.toUpperCase())
		.forEach(str -> System.out.println(str));
	
		courses.stream()
		.map(str -> str.toUpperCase())
		.forEach(System.out::println); // Use of Method References, println() is called each time for each element in the stream
	
		courses.stream()
		.map(str -> str.toUpperCase())
		.forEach(FP16MethodReferences::print); // Use of Method References and print is user defined static method
		 
		courses.stream()
//		.map(str -> str.toUpperCase())
		.map(String::toUpperCase)				// Use of Method References for calling over the object and toUpperCase() is not a static method in String class
		.forEach(FP16MethodReferences::print);  // print is UDF static method	
		
		Supplier<String> supplier = () -> new String(); // Lambda Expression which creates the string 
		Supplier<String> supplier2 = String::new; // Constructor References
	
	}	
}
