package module7;

public class FP24JoiningStringswithjoiningandPlayingwithflatMap {

	public static void main(String[] args) {
		
//				jshell> List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
//				courses ==> [Spring, Spring Boot, API, Microservices, AWS, PCF, Azure, Docker, Kubernetes]
//
//				jshell> courses.stream().collect(Collectors.joining(" "));
//				$14 ==> "Spring Spring Boot API Microservices AWS PCF Azure Docker Kubernetes"
//
//				jshell> courses.stream().collect(Collectors.joining(","));
//				$15 ==> "Spring,Spring Boot,API,Microservices,AWS,PCF,Azure,Docker,Kubernetes"
//
//				jshell> "Spring".split("")
//				$16 ==> String[6] { "S", "p", "r", "i", "n", "g" }
//				
//				jshell> courses.stream().map(course -> course.split("")).collect(Collectors.toList());
//				$17 ==> [[Ljava.lang.String;@3108bc, [Ljava.lang.String;@370736d9, [Ljava.lang.String;@5f9d02cb, [Ljava.lang.String;@63753b6d, [Ljava.lang.String;@6b09bb57, [Ljava.lang.String;@6536e911, [Ljava.lang.String;@520a3426, [Ljava.lang.String;@18eed359, [Ljava.lang.String;@3e9b1010]
//
//				jshell> courses.stream().map(course -> course.split("")).flatMap(Arrays::stream).collect(Collectors.toList());
//				$18 ==> [S, p, r, i, n, g, S, p, r, i, n, g,  , B, o, o, t, A, P, I, M, i, c, r, o, s, e, r, v, i, c, e, s, A, W, S, P, C, F, A, z, u, r, e, D, o, c, k, e, r, K, u, b, e, r, n, e, t, e, s]
//
//				jshell> courses.stream().map(course -> course.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList())
//				;
//				$19 ==> [S, p, r, i, n, g,  , B, o, t, A, P, I, M, c, s, e, v, W, C, F, z, u, D, k, K, b]
	}

}
