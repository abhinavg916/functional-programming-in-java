//Task – Uppercase all the content in the list
package module8;

public class FP28replaceAllremoveIf {

	public static void main(String[] args) {

//		jshell> List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
//				 "Kubernetes");
//		courses ==> [Spring, Spring Boot, API, Microservices, AWS, PCF, Azure, Docker, Kubernetes]
//
//		jshell> courses.replaceAll( str -> str.toUpperCase());
//		|  Exception java.lang.UnsupportedOperationException
//		|        at ImmutableCollections.uoe (ImmutableCollections.java:73)
//		|        at ImmutableCollections$AbstractImmutableList.replaceAll (ImmutableCollections.java:105)
//		|        at (#2:1)
//
//		jshell> List<String> modifiableCourses = new ArrayList(courses)
//		|  Warning:
//		|  unchecked call to ArrayList(java.util.Collection<? extends E>) as a member of the raw type java.util.ArrayList
//		|  List<String> modifiableCourses = new ArrayList(courses);
//		|                                   ^--------------------^
//		|  Warning:
//		|  unchecked conversion
//		|    required: java.util.List<java.lang.String>
//		|    found:    java.util.ArrayList
//		|  List<String> modifiableCourses = new ArrayList(courses);
//		|                                   ^--------------------^
//		modifiableCourses ==> [Spring, Spring Boot, API, Microservices, AWS, PCF, Azure, Docker, Kubernetes]
//
//		jshell> modifiableCourses.replaceAll( str -> str.toUpperCase());
//
//		jshell> modifiableCourses
//		modifiableCourses ==> [SPRING, SPRING BOOT, API, MICROSERVICES, AWS, PCF, AZURE, DOCKER, KUBERNETES]
//
//		jshell> courses.stream().map(str -> str.toUpperCase()).forEach(System.out::println)
//		SPRING
//		SPRING BOOT
//		API
//		MICROSERVICES
//		AWS
//		PCF
//		AZURE
//		DOCKER
//		KUBERNETES
//
//		jshell> modifiableCourses.removeIf( str -> str.length()<6);
//		$7 ==> true
//
//		jshell> modifiableCourses
//		modifiableCourses ==> [SPRING, SPRING BOOT, MICROSERVICES, DOCKER, KUBERNETES]

	}

}
