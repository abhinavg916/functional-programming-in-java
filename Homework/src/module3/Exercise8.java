package module3;

import java.util.List;

public class Exercise8 {

	public static void main(String[] args) {
//		Using IDE
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		System.out.println(numbers.stream().map(x -> x * x * x).reduce(0, (x, y) -> x + y));
		System.out.println(numbers.stream().map(x -> x * x * x).reduce(0, Integer::sum));

//		Using JShell
//		jshell> numbers.stream().map(x -> x*x*x).reduce(0, (x,y) -> x+y)
//		$4 ==> 10109

//		jshell> numbers.stream().map(x -> x*x*x).reduce(0, Integer::sum)
//		$4 ==> 10109
	}

}
