// Task - To find the distinct number in the list
package module3;

import java.util.List;

public class FP06UseofDistinct {

	public static void main(String[] args) {
//		Using IDE
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		numbers.stream().distinct().forEach(System.out::println);

//		Using JShell
//		jshell> numbers.stream().distinct().forEach(System.out::println)
//		12
//		9
//		13
//		4
//		6
//		2
//		15
	}

}
