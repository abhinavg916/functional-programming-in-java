// Task - Joining Strings in streams, Creating Pairs
package module7;

public class FP24JoiningStringswithjoiningandPlayingwithflatMap {

	public static void main(String[] args) {
		
//		jshell> List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
//		courses ==> [Spring, Spring Boot, API, Microservices, AWS, PCF, Azure, Docker, Kubernetes]
//
//		jshell> courses.stream().collect(Collectors.joining(" "));
//		$14 ==> "Spring Spring Boot API Microservices AWS PCF Azure Docker Kubernetes"
//
//		jshell> courses.stream().collect(Collectors.joining(","));
//		$15 ==> "Spring,Spring Boot,API,Microservices,AWS,PCF,Azure,Docker,Kubernetes"
//
//		jshell> "Spring".split("")
//		$16 ==> String[6] { "S", "p", "r", "i", "n", "g" }
//				
//		jshell> courses.stream().map(course -> course.split("")).collect(Collectors.toList());
//		$17 ==> [[Ljava.lang.String;@3108bc, [Ljava.lang.String;@370736d9, [Ljava.lang.String;@5f9d02cb, [Ljava.lang.String;@63753b6d, [Ljava.lang.String;@6b09bb57, [Ljava.lang.String;@6536e911, [Ljava.lang.String;@520a3426, [Ljava.lang.String;@18eed359, [Ljava.lang.String;@3e9b1010]
//
//		jshell> courses.stream().map(course -> course.split("")).flatMap(Arrays::stream).collect(Collectors.toList());
//		$18 ==> [S, p, r, i, n, g, S, p, r, i, n, g,  , B, o, o, t, A, P, I, M, i, c, r, o, s, e, r, v, i, c, e, s, A, W, S, P, C, F, A, z, u, r, e, D, o, c, k, e, r, K, u, b, e, r, n, e, t, e, s]
//
//		jshell> courses.stream().map(course -> course.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList())
//				;
//		$19 ==> [S, p, r, i, n, g,  , B, o, t, A, P, I, M, c, s, e, v, W, C, F, z, u, D, k, K, b]
//		
//		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
//		courses ==> [Spring, Spring Boot, API, Microservices, AWS, PCF, Azure, Docker, Kubernetes]
//
//		jshell> List<String> courses2 = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", " zure", "Docker", "Kubernetes");
//		courses2 ==> [Spring, Spring Boot, API, Microservices, AWS, PCF, Azure, Docker, Kubernetes]
//
//		jshell> courses.stream().flatMap(course -> courses2.stream().map(course2 -> List.of(course, course2)))
//		$6 ==> java.util.stream.ReferencePipeline$7@4f7d0008
//
//		jshell> courses.stream().flatMap(course -> courses2.stream().map(course2 -> List.of(course, course2))).collect(Collectors.toList())
//		$7 ==> [[Spring, Spring], [Spring, Spring Boot], [Spring, API], [Spring, Microservices], [Spring, AWS], [Spring, PCF], 
//		[Spring, Azure], [Spring, Docker], [Spring, Kubernetes], [Spring Boot, Spring], [Spring Boot, Spring Boot], 
//		[Spring Boot, API], [Spring Boot, Microservices], [Spring Boot, AWS], [Spring Boot, PCF], [Spring Boot, Azure], 
//		[Spring Boot, Docker], [Spring Boot, Kubernetes], [API, Spring], [API, Spring Boot], [API, API], [API, Microservices], 
//		[API, AWS], [API, PCF], [API, Azure], [API, Docker], [API, Kubernetes], [Microservices, Spring], [Microservices, Spring Boot], 
//		[Microservices, API], [Microservices, Microservices], [Microservices, AWS], [Microse ... ], [Docker, API], 
//		[Docker, Microservices], [Docker, AWS], [Docker, PCF], [Docker, Azure], [Docker, Docker], [Docker, Kubernetes], 
//		[Kubernetes, Spring], [Kubernetes, Spring Boot], [Kubernetes, API], [Kubernetes, Microservices], [Kubernetes, AWS], 
//		[Kubernetes, PCF], [Kubernetes, Azure], [Kubernetes, Docker], [Kubernetes, Kubernetes]]
//
//		jshell> courses.stream().flatMap(course -> courses2.stream().map(course2 -> List.of(course, course2))).
//		filter(list -> !list.get(0).equals(list.get(1))).collect(Collectors.toList())
//		$8 ==> [[Spring, Spring Boot], [Spring, API], [Spring, Microservices], [Spring, AWS], [Spring, PCF], [Spring, Azure], 
//		[Spring, Docker], [Spring, Kubernetes], [Spring Boot, Spring], [Spring Boot, API], [Spring Boot, Microservices], 
//		[Spring Boot, AWS], [Spring Boot, PCF], [Spring Boot, Azure], [Spring Boot, Docker], [Spring Boot, Kubernetes], 
//		[API, Spring], [API, Spring Boot], [API, Microservices], [API, AWS], [API, PCF], [API, Azure], [API, Docker], 
//		[API, Kubernetes], [Microservices, Spring], [Microservices, Spring Boot], [Microservices, API], [Microservices, AWS], 
//		[Microservices, PCF], [Microservices, Azure], [Microservices, Docker], [Microservices, Kubernetes] ... tes], 
//		[Docker, Spring], [Docker, Spring Boot], [Docker, API], [Docker, Microservices], [Docker, AWS], [Docker, PCF], [Docker, Azure], 
//		[Docker, Kubernetes], [Kubernetes, Spring], [Kubernetes, Spring Boot], [Kubernetes, API], [Kubernetes, Microservices], 
//		[Kubernetes, AWS], [Kubernetes, PCF], [Kubernetes, Azure], [Kubernetes, Docker]]
//		
//		jshell> courses.stream().flatMap(course -> courses2.stream().filter(course2 -> course2.length()==course
//				.length()).map(course2 -> List.of(course, course2))).filter(list -> !list.get(0).equals(list.get(1)))
//				.collect(Collectors.toList())
//		$9 ==> [[Spring, Docker], [API, AWS], [API, PCF], [AWS, API], [AWS, PCF], [PCF, API], [PCF, AWS], [Docker, Spring]]

	}
}
