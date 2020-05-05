package module3;

import java.util.List;

public class Exercise9 {

	public static void main(String[] args) {
//		Using IDE
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		System.out.println(numbers.stream().filter(x -> x % 2 != 0).reduce(0, (a, b) -> a + b));
		System.out.println(numbers.stream().filter(x -> x % 2 != 0).reduce(0, Integer::sum));

//		Using JShell
//		jshell> numbers.stream().filter(x -> x%2 !=0).reduce(0, (a,b) -> a+b)
//		$5 ==> 37

//		jshell> numbers.stream().filter(x -> x%2 !=0).reduce(0, Integer::sum)
//		$4 ==> 37
	}

}
