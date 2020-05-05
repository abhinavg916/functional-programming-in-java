// Behind the scenes working of Lambda Expressions and Functional Interfaces
package module4;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP11FunctionalInterfaces {

	/*
		 - Equivalent method for filter()
		 public static boolean isEven(int x){
		 	return x % 2 == 0;
		 }
		 
		 - Equivalent method for map() 
		 public static int squared (int x){
		 	return x*x;
		 }
		 
		 - Equivalent method for forEach()
		 public static void print(int x){
		 System.out.println(x);	    OR		forEach( x -> System.out.println(x));
	 */
	
	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		// Scenario 1
		numbers.stream().filter(x -> x%2==0).map(x -> x*x).forEach(System.out::println);
		
		// Scenario 2
//		numbers.stream().filter(FP11::isEven).map(FP11::map).forEach(FP11::print);
		
		// Scenario 3
		// Extract as local variable for filter(), map(), forEach()
		Predicate<Integer> isEvenPredicate = x -> x % 2 == 0; // Predicate Function
		Function<Integer, Integer> squaredMapper = x -> x * x; // Function Function
		Consumer<Integer> printAction = System.out::println;

		numbers.stream().filter(isEvenPredicate).map(squaredMapper).forEach(printAction);

		// Scenario 4
		Predicate<Integer> isEvenPredicate2 = new Predicate<Integer>() {
			@Override
			public boolean test(Integer x) {
				return x%2==0;
			}
		};
		
		Function<Integer, Integer> squaredMapper2 = new Function<Integer, Integer>(){
			@Override
			public Integer apply(Integer x) {
				return x*x;
			}
		};
		
		Consumer<Integer> printAction2 = new Consumer<Integer>() {
			@Override
			public void accept(Integer x) {
				System.out.println(x);
			}
		};
				
		numbers.stream().filter(isEvenPredicate2).map(squaredMapper2).forEach(printAction2);

	}
}
